
class Parent{
    public Parent(){
        System.out.println("Parent Constructor");
    }
    public void display(){
        System.out.println("Parent Display");
    }
}

class Child extends Parent{
    public Child(){
        System.out.println("Child Constructor");
    }
    
    public void display(int x){
        System.out.println("Child Display");
    }
}

public class MethodOverriding {
    public static void main(String args[]){
        Parent p=new Parent();
        Child c=new Child();
        Parent pc=new Child();
        p.display();
        c.display(10);
        pc.display();
        pc.display();


    }
}
