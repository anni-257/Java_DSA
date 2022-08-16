import java.util.Scanner;
public class Income_Tax{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your salary amount= ");
        float sal=sc.nextFloat();
        float tax=0;

        if(sal<500000){
            tax=0;
        }else if(sal>=500000 && sal<1000000){
            tax=sal*(0.2f);
        }else{
            tax=sal*(0.3f);
        }

        System.out.println("Your payable tax amount is= "+tax+" on your salary amount "+sal);
        sc.close();

    }
}