import java.util.Scanner;

/*ArrayLife can represent bigger board of game of life,
 while PackedLife ocupyies siginificantly less space than
  ArrayLife.*/

public class PackedLife {
	private int width;
	private int height;
	private long world;
	private long nextWorld;
	private Pattern pattern;
	
	public static void main(String[] args) {
		PackedLife pl = new PackedLife(args[0]);
		pl.play();
	}

	private PackedLife(String format){
		setPackedLife(format);
	}

	public void setPackedLife(String format){
		String[] parts = format.split(":");
		this.width = Integer.valueOf(parts[2]);
		this.height = Integer.valueOf(parts[3]);
		nextWorld = 0;
		this.pattern = new Pattern(format);
		world = pattern.initialise();
	}

	public boolean getCell(int row, int col, long world){
		if (row < 0 || row >= height) {
			return false;
		}
		if (col < 0 || col >= width) {
			return false;
		}
		if (((world >>> (row * width + col)) & 1L) == 1L)
			return true;
		else
			return false;
	}

	public void setCell(int row, int col, boolean value){
		long cell;
		if(value){
			cell = 1L<<(row * width + col);
			world = world | cell;
		}
		else{
			cell = ~(1L<<(row * width + col));
			world = world & cell;
		}
	}

	public void print(long world){
		for(int row = 0; row < height; row++){
			for(int col = 0; col < width; col++){
				if(getCell(row,col, world))
					System.out.print("# ");
				else
					System.out.print("_ ");
				
			}	
			System.out.println();
		}
	}

	public int countNeighbours(int row, int col){
		int liveCells = 0;
		for(int r = 0; r < 3; r++){
			for(int c = 0; c < 3; c++){
				if(!(c == 1 && r == 1)) {
					if(getCell(row - 1 + r, col - 1 + c, nextWorld)) {
						liveCells++;
					}
				}
			}
		}
		return liveCells;
	}

	public boolean computeCell(int row, int col){
		int liveCells = countNeighbours(row,col);

		if(liveCells < 2){
			return false;
		}
		if(liveCells == 3){
			return true;
		}
		if(liveCells > 3){
			return false;
		}
		return getCell(row, col, nextWorld);
	}

	public void nextGeneration(){
		nextWorld = world;
		for(int row = 0; row < height; row++){
			for(int col = 0; col < width; col++){
					setCell(row,col, computeCell(row,col));		
			}	
		}
	}

	public void play(){
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		String st;
		pattern.print();
		while(flag){
			nextGeneration();
			st = sc.next();
			if(st.equals("s"))
				flag = true;
			if(st.equals("q"))
				flag = false;
			print(nextWorld);
		}
	}
}
