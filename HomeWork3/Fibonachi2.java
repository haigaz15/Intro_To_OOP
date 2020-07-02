import java.util.*;
public class Fibonachi2{
    public static int fibonachiRec(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else{
            return fibonachiRec(n-1) + fibonachiRec(n-2);
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number : ");
        int n = sc.nextInt();
        sc.close();
        int results = 0;
        if(n>= 1 && n<= 80){
            results = fibonachiRec(n);
        }
        System.out.println("The fibonchi number is : "+ results);
    }
}