import java.util.*;
public class CircleDemo{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your radius number : ");
    double r = sc.nextInt();
    Circle circle = new Circle(r); 
    circle.circumference(r);
    System.out.println("This is the circumference : " + circle.circumference(r));
    circle.area(r);
    System.out.println("This is the area : " + circle.area(r));
    }
}