import java.util.Scanner;

public class basics{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a: ");
        int a=sc.nextInt();
        System.out.print("Enter b: ");
        int b=sc.nextInt();

        System.out.println("Sum of two number is: "+(a+b));
        sc.close();
    }
}
