import java.util.*;

public class SecondeQuestion {
 	
	public static void main(String[] args) {
        String[] numberName = new String[101];
		numberName[6] = "Million";
		numberName[9] = "Billion";
		numberName[12] = "Trillion";
		numberName[15] = "Quadrillion";
		numberName[18] = "Quintillion";
		numberName[21] = "Sextillion";
		numberName[30] = "Nonillion";
		numberName[100] = "Google";
		for(int i = 0; i<numberName.length; i++) {
			Scanner keyboard = new Scanner(System.in);
	 	    System.out.println("Type the power of 10");
			    int  x = keyboard.nextInt() ;
				if(x == 6 ) {
			    System.out.println(numberName[x]);
				}else if(x == 9) {
					System.out.println(numberName[x]);
				}
				else if(x == 12) {
					System.out.println(numberName[x]);
				}
				else if(x == 15) {
					System.out.println(numberName[x]);
				}
				else if(x == 18) {
					System.out.println(numberName[x]);
				}
				else if(x == 21) {
					System.out.println(numberName[x]);
				}
				else if(x == 30) {
					System.out.println(numberName[x]);
				}
				else if(x == 100) {
					System.out.println(numberName[x]);
				}
		}
 	  }
	}


