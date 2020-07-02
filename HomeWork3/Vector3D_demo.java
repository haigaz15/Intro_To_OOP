import java.util.*;
public class Vector3D_demo{
    public static void main(String[] args){
        Vector3D vector = new Vector3D();
        int [] array1 = vector.vector1Printer();
        int [] array2 = vector.vector2Printer();
        int[] crossProduct = vector.crossProduct(array1,array2);
        System.out.print("The cross product is : (");
        for(int i = 0; i<crossProduct.length; i++){
            System.out.print(crossProduct[i] + " ");
        }
        System.out.print(")");
    }
}