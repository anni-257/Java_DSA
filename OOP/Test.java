class Rectangle{
    private int length;
    private int width;

    public void setter(int length,int width){
        if(length>0){
            this.length=length;
        }
        if(width>0){
            this.width=width;
        }
        else{
            length=0;
            width=0;
        }

    }

    public int getLength(){
        return length;
    }

    public int getWidth(){
        return width;
    }

    public int area(){
        return length*width;
    }

    public int perimeter(){
        return 2*length*width;
    }
}



public class Test{
    public static void main(String arg[]){
        Rectangle r=new Rectangle();
        r.setter(10, 20);
        System.out.println("length: "+r.getLength()+"\n"+"Width: "+r.getWidth());
        System.out.println("Area of a rectangle: "+r.area());
        System.out.println("Perimeter of rectangle: "+r.perimeter());
    }
}