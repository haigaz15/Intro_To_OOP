import java.util.*;
public class EighthQuestion {
  public static void generateString(StringBuilder sb, int index, int capacity) {
	  if(index==capacity) {
		  return;
	  }
	  if(index == 0 || sb.charAt(index-1)!='0') {
		  sb.append('0');
	  
	  if(sb.length() == capacity) {
		  System.out.println(sb);
		  System.out.println();
	  }
	  generateString(sb,index+1, capacity);
	  sb.delete(index, index+1);
   
	  }
	  sb.append('1');
	  if(sb.length() == capacity) {
		  System.out.println(sb );
		  System.out.println();
	  }
	  generateString(sb,index+1,capacity);
	  sb.delete(index,index+1);
  }
  	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	int inputNumber = keyboard.nextInt();
	System.out.println();	
	StringBuilder sb = new StringBuilder();
	generateString(sb,0,inputNumber);
    
	}

}
/* for n = 4 it does 32 recursive calls*/