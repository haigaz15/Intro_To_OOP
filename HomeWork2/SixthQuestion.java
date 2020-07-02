import java.util.*;
public class SixthQuestion {

	public static void main(String[] args) {
	String  input =   inputString()	;
	checker(input);
     
	}
	public static String inputString(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Write your six digit number here: ");
		int n = sc.nextInt();
		String x = Integer.toString(n);
	   return x;
	}
    public static void checker(String m) {
    	if(m.charAt(0) + m.charAt(1)+ m.charAt(2) == m.charAt(3)+m.charAt(4)+m.charAt(5)) {
    		System.out.println("You got the lucky number !!");
    	}else {
    		System.out.println( "Compile and try again" );
    	}
    }
}
