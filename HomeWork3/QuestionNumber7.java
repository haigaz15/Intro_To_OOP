import java.util.*;
public class QuestionNumber7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st1 = sc.next();
        String st2 = sc.next();
        int c = 0;
        int i = 0;
        while(i <st1.length()){
            for(int j = st1.length(); j>i; j--){
               String st3 = st1.substring(i,j);
               String isCycle = st2;
               for(int k = 0;k<isCycle.length(); k++){
                   if(st3.equals(isCycle)){
                       c++;
                   }
                   isCycle = isCycle.substring(2,isCycle.length()) + isCycle.substring(0,2);
               }
            }
           i++;
        }
        System.out.println(c);
    }
}