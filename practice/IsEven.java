import java.util.Scanner;

public class IsEven{

    static public boolean isEven(int n){
        if((n&1)==0){
            return true;
        }

        return false;
    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num=sc.nextInt();

        System.out.println("isEven: "+(isEven(num)));
        sc.close();
       
    }
}