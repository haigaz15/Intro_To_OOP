import java.util.*;
public class QuestionNumber2{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int inputNumber = sc.nextInt();
    int[] range = {100,200,300,400,500,600,700,800,900,1000};
    percentageCalculator(inputNumber,range);
    }
    public static boolean isPrime(int num){
       for(int i = 2; i < num; i++){
           if(i == 2)
               return true;
            if(num % i == 0){
               return false;
           }
       }
       return true;
    }
    public static void percentageCalculator(int n, int[] k){
        for(int i = 0; i<k.length; i++){ 
            double percentage = 0.0;
            double countPrimes = 0.0;
            for(int j = 1; j<=k[i]; j++){
                int random = (int)((Math.random()* n) + 1);
               // System.out.println(random);
                    if(isPrime(random)){
                        countPrimes++;
                        //System.out.println(countPrimes);
                   }
            }  
        percentage = (countPrimes / k[i]) * 100;
        System.out.println("The percentage for : " + k[i] + " is " + percentage + " %");
        }
    }
}