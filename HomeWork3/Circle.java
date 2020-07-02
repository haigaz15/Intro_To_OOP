public class Circle{
    double radius;
    final double pi = 3.14;
    public Circle(double radius){
        this.radius = radius; 
    }
    public double circumference (double radius){
        int i = 2;
        double c = i * pi*(radius);
        return c;
    }
    public double area (double radius){
        double a = pi*radius*radius;
        return a;
    }
     
}