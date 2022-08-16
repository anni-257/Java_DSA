import java.util.Scanner;
public class Print_Reverse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num=sc.nextInt();
        System.out.println("Reverse number: ");
        while(num!=0){
            System.out.print(num%10);
            num/=10;
        }
        sc.close();

    }
}