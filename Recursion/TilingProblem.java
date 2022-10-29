
import java.util.Scanner;
class TilingProblem{
    public static int tilingProblem(int n){
        //base case
        if(n==0 || n==1){
            return 1;
        }

        //kaam
        // vertical choice 
        int fnm1=tilingProblem(n-1);

        // horizantal choice 
        int fnm2=tilingProblem(n-2);

        int totalWays=fnm1+fnm2;

        return totalWays;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Size of floor/board given as '2*n'");
        System.out.print("Enter value for n: ");
        int n=sc.nextInt();
        int ans=tilingProblem(n);
        System.out.println("Number of ways to arrange tiles are: "+ans);


    }
}