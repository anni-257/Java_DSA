import java.util.Scanner;

public class Prime{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cnt=0;
        if(n==1){
            System.out.println("Not a prime number");
            sc.close();
            return;
            
        }
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                cnt++;
                if(i!=(n/i)){
                    cnt++;
                }
            }
        }

        if(cnt==2){
            System.out.println("This is a prime number");
        }else{
            System.out.println("This is not a prime number");
        }

        sc.close();
    }
}