import java.util.*;
public class QuestionNumber4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        rec(n,0);        
    }

    public static void rec(int v,int numberOfSteps){
        int sumNumber = 0;
        while(v>0){
            int n = v % 10;
            System.out.println("The Number of the remainder: "+n);
            numberOfSteps++;
            sumNumber = sumNumber + n;
            numberOfSteps++;
            v= v/10;
            System.out.println("The number of reduction: "+ v); 
            numberOfSteps++;          
        }
        numberOfSteps++;
        System.out.println("The Sum Number: "+ sumNumber);
        
        if(sumNumber>=10){
             rec(sumNumber,numberOfSteps);
        }
        else{
            System.out.println("The number of steps is : " + numberOfSteps );
        }    
    }
}
/* Yes the program always terminats because evatually all numbers will reduce their ranks to a single digit number based on this algorithm */