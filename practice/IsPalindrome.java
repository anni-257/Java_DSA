import java.util.Scanner;

public class IsPalindrome{

    public static boolean isPalindrome(int n){
        int ans=0;
        int m=n;
        while(n!=0){
            int rem=n%10;
            ans=(ans*10)+rem;
            n=n/10;
        }
        if(m==ans){
            return true;
        }

        return false;
    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        System.out.println("Ans: "+(isPalindrome(n)));
        sc.close();

    }
}