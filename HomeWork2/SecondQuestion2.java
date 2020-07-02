import java.util.*;
public class SecondQuestion2 {
  public static void main(String[] args) {
	    String[] numberName = new String[101];
		numberName[6] = "Million";
		numberName[9] = "Billion";
		numberName[12] = "Trillion";
		numberName[15] = "Quadrillion";
		numberName[18] = "Quintillion";
		numberName[21] = "Sextillion";
		numberName[30] = "Nonillion";
		numberName[100] = "Googol";
		for(int i = 0; i<numberName.length; i++) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Type the power of 10");
	  int x = keyboard.nextInt();
	  switch(x) {
	  case 6:
		  System.out.println(numberName[x]);
	  break;
	  case 9:
		  System.out.println(numberName[x]);
		  break;
	  case 12:
		  System.out.println(numberName[x]);
		  break;
	  case 15:
		  System.out.println(numberName[x]);
		  break;
	  case 18:
		  System.out.println(numberName[x]);
		  break;
	  case 21:
		  System.out.println(numberName[x]);
		  break;
	  case 30:
		  System.out.println(numberName[x]);
		  break;
	  case 100:
		  
	    }
      } 
   }
		
 }

  