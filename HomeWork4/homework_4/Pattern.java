public class Pattern{
	private String name;
	private String author;
	private int width;
	private int height;
	private int startCol;
	private int startRow;
	private String cells;
	private String[] cellsAt;

	public Pattern(String format){
		String[] parts = format.split(":");
		this.name = parts[0];
		this.author = parts[1];
		this.width = Integer.valueOf(parts[2]);
		this.height = Integer.valueOf(parts[3]);
		this.startCol = Integer.valueOf(parts[4]);
		this.startRow = Integer.valueOf(parts[5]);
		this.cells = parts[6];
		cellsAt = cells.split(" ");
	}

	public void print(){
		System.out.println("Name:    " + getName());
		System.out.println("Author:    " + getAuthor());
		System.out.println("Width:    " + getWidth());
		System.out.println("Height:    " + getHeight());
		System.out.println("StartCol:    " + getsStartCol());
		System.out.println("StartRow:    " + getStartRow());
		System.out.println("Pattern:    " + getCells());
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getsStartCol() {
		return startCol;
	}

	public int getStartRow() {
		return startRow;
	}

	public String getCells() {
		return cells;
	}

	public void initialise(boolean[][] world) {
		for(int r = 0; r < cellsAt.length; r++){
			String[] col = cellsAt[r].split("");
			for(int c = 0; c < col.length; c++){
				boolean val = false;
				int num = Integer.valueOf(col[c]);
				if(num == 1)
					val = true;
				if(num == 0)
					val = false;
				setCell(startRow + r, startCol + c, val, world);
			}
		}
	}
	//we return long becuasue need to get the number instead of creating matrix 
	public long initialise(){
      long world = 0L;
      String[] split = cells.split(" ");
      for(int i=0; i < split.length; i++){
          for(int j=0; j < split[i].length(); j++){
              if(split[i].charAt(j) == '1'){
                  world = (1L << ((startRow + i) * width + (startCol + j))) | world;
              }
          }
      }
      return world;
    }

	public void setCell(int row, int col, boolean value, long world){
		long cell = 0L;
		if(value){
			cell = 1L<<(row * width + col);
			world = world | cell;
		}
		else{
			cell = ~(1L<<(row * width + col));
			world = world & cell;
		}
	}

	public void setCell(int row, int col, boolean value, boolean[][] world){
		if (check(row, col)){
			world[row][col] = value;
		}
		else{
			System.out.println("Invalid input"); 
			System.exit(0);
		}
	}

	public boolean check(int row, int col){
		if (row < 0 || row >= height) {
			return false;
		}
		if (col < 0 || col >= width) {
			return false;
		}
			return true;
	}
}