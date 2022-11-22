

class Circle{
    private double radius;
    public Circle(){
        radius=0;
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public double area(){
        return Math.PI*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double getRadius(){
        return radius;
    }
}

class Cylinder extends Circle{
    private double height;
    public Cylinder(){
        height=0;
    }
    public Cylinder(double radius,double height){
        super(radius);
        this.height=height;
    }
    public double volumn(){
        return Math.PI*getRadius()*getRadius()*height;
    }
}

public class MyClass {
    public static void main(String args[]){
        Circle c=new Circle(6.0);
        Cylinder cd=new Cylinder(6.0,6.0);
        System.out.println("Area of a Circle: "+c.area());
        System.out.println("Perimeter of a Circle: "+c.perimeter());
        System.out.println("Volumn of Cylinder: "+cd.volumn());

    }
}
