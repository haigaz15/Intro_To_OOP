public class FirstQuestion{
  public static void main(String[] args){
    short  firstNum = 5;
    short  secondNum = 6;
    short  thirdNum = 6;
// I was unable to declare sum, average with byte, short or char because apparentally they do not support opperations on them
    int  sum = firstNum + secondNum + thirdNum;
// I wrote the average as "float" average = (float)sum/2 so that it prints 8.5 instead of 8.0 
    float average =  (float)sum/2;
    System.out.println(average);
     }
  }

