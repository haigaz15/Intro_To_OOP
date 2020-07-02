import java.util.Scanner;

public class ArrayLife {
	private int width;
	private int heigth; 
	private boolean[][] world;
	private boolean[][] nextWorld;
	private String[] cellsAt;
	private Pattern pattern;

	public static void main(String[] args) {
		//it is essential to use the double quotes (") around the format
		//string so that the program will take it as one string and split it
		ArrayLife al = new ArrayLife(args[0]);
		al.play();
	}
	
	private ArrayLife(String format){
		setArrayLife(format);
	}

	public void setArrayLife(String format){
		String[] parts = format.split(":");
		this.width = Integer.valueOf(parts[2]);
		this.heigth = Integer.valueOf(parts[3]);
		world = new boolean[this.heigth][this.width];
		nextWorld = new boolean[this.heigth][this.width];

		this.pattern = new Pattern(format);
		pattern.initialise(world);

	}
	// checks if the given cordinates are whitin the matrix
	public boolean check(int row, int col){
		if (row < 0 || row >= heigth) {
			return false;
		}
		if (col < 0 || col >= width) {
			return false;
		}
			return true;
	}
	// gets the value of the cell in given cordinates
	public boolean getCell(int row, int col){
		if(check(row, col)){
			return world[row][col];
		}
		return false;
	}
	// sets the value of an individual cell
	public void setCell(int row, int col, boolean value, boolean[][] world){
		if (check(row, col)){
			world[row][col] = value;
		}
		else{
			System.out.println("Invalid input"); 
			System.exit(0);
		}
	}

	public void print(){
		for(boolean[] row: world){
			for(boolean x: row){
				if(x){
					System.out.print(" #");
				}
				else System.out.print(" _");
			}
			System.out.println();
		}
	}

	// makes the next generation acording to Game of Life 
	// rules
	public boolean computeCell(int row, int col){
		int liveCells = 0;
		for(int r = 0; r < 3; r++){
			for(int c = 0; c < 3; c++){
				if(!(c == 1 && r == 1)) {
					if(getCell(row - 1 + r, col - 1 + c)) {
						liveCells++; 
					}
				}
			}
		}
		if(liveCells < 2){
			return false;
		}
		if(liveCells == 3){
			return true;
		}
		if(liveCells > 3){
			return false;
		}
		return getCell(row, col);
	}
	
	// copys the values of one martix into another
	public void copyMatrix(boolean[][] matrix, boolean [][] newMatrix){
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				newMatrix[i][j] = matrix[i][j];
			}
		}
	}
	// creates the next generation with method computeCell
	public void nextGeneration(){
		for(int r = 0; r < heigth; r++){
			for(int c = 0; c < width; c++){
				nextWorld[r][c] = computeCell(r, c);
			}
		}
		copyMatrix(nextWorld, world);
	}

	public void play(){
		pattern.print();
		print();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		String st;
		while(flag){
			st = sc.next();
			if(st.equals("s"))
				flag = true;
			if(st.equals("q"))
				flag = false;
			nextGeneration();
			System.out.println("Next generation is:");
			print();
		}
	}			
}
