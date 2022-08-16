
import java.util.*;

public class KeyBoard {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter values for a and b resp: ");
        a=sc.nextInt();
        b=sc.nextInt();

        System.out.println("Sum of "+a+" and "+b+" is: "+(a+b));
        sc.close();

    }
}
