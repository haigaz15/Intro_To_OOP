import java.util.*;
public class ForthQuestion {

	public static void main(String[] args) {
		int [] arraytemp = inputArray();			
		int maxTemp = maxTemp(arraytemp);
		System.out.println("The hottest day of the month: " + maxTemp + " celsius");
		System.out.println();
		int miniTemp = miniTemp(arraytemp);
		System.out.println("The coldest day of the month: "+ miniTemp + " celsius");
		System.out.println();
		int averageTemp = average(arraytemp);
		System.out.println("The average temperature of the month: " + averageTemp);
		System.out.println();
		System.out.println("The diffrence between the hottest and the coldest days: " + (maxTemp - miniTemp));
	}
   public static int maxTemp(int[] arraytemp) {
	   int max = arraytemp[0];
	   for(int i = 0; i<arraytemp.length; i++) {
		   if(arraytemp[i]> max) {
		   max = arraytemp[i];
		   } 
	   }
          return max;   
   }
   
 public static int[] inputArray() {
	 Scanner keyboard = new Scanner(System.in);
	 int n = keyboard.nextInt();
	 int[] arraytemp = new int[n];
	 for(int k = 0; k<n; k++) {
		 arraytemp[k] = keyboard.nextInt();
	 }
    return arraytemp;
 }
 public static int miniTemp(int[] arraytemp) {
	 int mini = arraytemp[0];
	 for(int j = 0; j<arraytemp.length; j++) {
         if(arraytemp[j]<mini) {
	     mini = arraytemp[j];
		 }
	 }
         return mini; 
 }
 
 public static int average(int[] arraytemp) {
	 int x = 0;
	 for(int k = 0; k<arraytemp.length; k++) {
	      x = x + arraytemp[k];
	 }
	 int avg = x/arraytemp.length;
	 return avg; 
    }
 }
 
