import java.util.Scanner;

public class SeventhQuestion {
	public static void main(String[] args){
		int[][] matrix = matrixBuilder(matirxbuild);
		printMatrix(matrix);
	}
		public static int[][] matrixBuilder() {

		int f = 1;
		int m = 0;
		int l = n - 1;

		for( m = 0; m < n; m++) {
			for(int c = m; c <= l; c++) {
				matrix[m][c] = f++;
			}
			for(int r = m + 1; r <= l; r++) {
				matrix[r][l] = f++;
			}
			for(int c = l - 1; c >= m; c--) {
				matrix[l][c] = f++;
			}
			for(int r = l - 1; r > m; r--) {
				matrix[r][m] = f++;
			}
			l--;
		}	
		return matrix;
		
	}
	public static int[][] matirxbuild(){

		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		int[][] matrix = new int[n][n];
		return matrix;
	}
	public static void printMatrix(int[][] matrix) {
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}