
// import java.lang.*;

class Circle{
    private float radius;
    private float pi;

    public Circle(float radius){
        this.radius=radius;
        this.pi=3.14f;
    }
    public float area(){
        return pi*radius*radius;
    }
    public float perimeter(){
        return 2*pi*radius;
    }
}

public class CircleDemo {
    public static void main(String args[]){
        Circle c1=new Circle(10.0f);
        System.out.println("Area of a circle is: "+c1.area());
        System.out.println("Perimeter of a circle is: "+c1.perimeter());
    }
}

