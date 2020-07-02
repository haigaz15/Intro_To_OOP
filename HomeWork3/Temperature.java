import java.util.*;

public class Temperature{
    
    public  int[] inputArray() {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int[] arraytemp = new int[n];
        for(int k = 0; k<n; k++) {
            arraytemp[k] = keyboard.nextInt();
        }
       return arraytemp;
    }
    
    public  int miniTemp(int[] arraytemp) {
        int mini = arraytemp[0];
        for(int j = 0; j<arraytemp.length; j++) {
            if(arraytemp[j]<mini) {
            mini = arraytemp[j];
            }
        }
            return mini; 
    }
    
    public  int maxTemp(int[] arraytemp) {
        int max = arraytemp[0];
        for(int i = 0; i<arraytemp.length; i++) {
            if(arraytemp[i]> max) {
            max = arraytemp[i];
            } 
        }
           return max;   
    }
    
    public  int average(int[] arraytemp) {
        int x = 0;
        for(int k = 0; k<arraytemp.length; k++) {
             x = x + arraytemp[k];
        }
        int avg = x/arraytemp.length;
        return avg; 
       }
    }
