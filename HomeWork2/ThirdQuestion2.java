import java.util.*;
public class ThirdQuestion2 {
  public static long recFactorial(long m) {
	 if(m == 1) {
		 return 1;
	 }
	    m =   m * recFactorial(m-1);
	  
	  return m;
  }
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Type your number to compute it's factroial");
		long n = keyboard.nextInt();
		 long factorial  = recFactorial(n);
          System.out.println(factorial);
	}

}
/* maximum number that can be entered to factorial of type long is 65 since the type long has a capacity of 2^64 */