import java.util.*;
public class ThirdQuestion {
	public static void main(String[] args) {
		   Scanner keyboard = new Scanner(System.in);
		   System.out.println("Type your number to compute it's factroial");
		   int  n = keyboard.nextInt();
		   int factorial = factorial(n);
		   System.out.println(factorial);
	   }
	
	public static int factorial(int m) {
	    int x = 1;
	    for(int i = 0; i<m; i++) {
	    	x = x*m;
	    	m = m-1;
	    }
      return x;
   }
   
	
}
