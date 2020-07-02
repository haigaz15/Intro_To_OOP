import java.util.*;
public class Vector3D{
    Scanner sc = new Scanner(System.in);
    public int[] vector1Printer(){
        int[] array1 = new int[3];
        System.out.println("write the coordinates of your first vector");
        for(int i = 0; i<array1.length; i++){
            array1[i] = sc.nextInt();
        }
            return array1;
    }

     public int[] vector2Printer(){
        int[] array2 = new int[3];
        System.out.println("write the coordinates of your second vector");
        for(int i = 0; i<array2.length; i++){
            array2[i] = sc.nextInt();
        }
            return array2;
    }

    public int[] crossProduct(int [] array1, int[] array2){
        int first = array1[1]*array2[2] - array2[1]*array1[2];
        int second = array1[0]*array2[1] - array1[1] * array2[0];
        int third = array1[2] * array2[0] - array1[0]* array2[2];
        int[] crossProduct = new int[3] ;
        for(int i = 0; i<crossProduct.length; i++){
            if(i == 0){
                crossProduct[i] = first;
            }
            else if(i == 1){
                crossProduct[i] = second;
            }
            else if(i == 2){
                crossProduct[i] = third;
            } 
        }
            return crossProduct;      
    }
        
}
