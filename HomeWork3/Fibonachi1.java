import java.util.*;
public class Fibonachi1{
    public static int fibonachiComputer(int n){
        int [] arr = new int[n+1];
        arr[0] = 1;
        arr[1] = 1;
        for(int i = 2; i<=n; i++){
         arr[i] = arr[i-1] + arr[i-2];
        } 
        return arr[n];
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number here :");
    int n = sc.nextInt();
    sc.close();
    int results = 0;
    if(n>=1 && n<=80){
     results = fibonachiComputer(n);
    }
    System.out.println("Xn is : " + results); 
    }
}