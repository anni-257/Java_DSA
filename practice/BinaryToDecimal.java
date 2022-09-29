import java.util.Scanner;

public class BinaryToDecimal{

    public static int decToBin(int num){
        int ans= 0;
        int cnt= 0;
        /* 
        while(num!=0){
            int bit=num&1;
            ans=(bit*(int)Math.pow(10,cnt++))+ans;
            num=num>>1;
        }*/

        while(num!=0){
            int rem=num% 2;
            ans=(rem*(int) Math.pow(10,cnt++))+ans;
            num=num/2 ;
        }

        return ans ;
    }



    public static int binToDec(int num){
        int ans=0;
        int cnt=0;
        while(num!=0){
            int rem=num%10;
            if(rem!=0){
                ans+=(rem*(int)Math.pow(2,cnt));
            }
            cnt++;
            num=num/10;
        }

        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("1. Binary to Decimal");
        System.out.println("2. Decimal to Binary");
        System.out.print("Enter Option: ");
        int n=sc.nextInt();
        int ans=0;
        switch(n){
            case 1:System.out.print("Enter Binary Number: ");
                    int num=sc.nextInt();
                    ans=binToDec(num);
                    break;

            case 2:System.out.print("Enter Decimal Number: ");
                    int num2=sc.nextInt();
                    ans=decToBin(num2);
                    break;

            default:
                System.out.println("Wrong Input: <)");
        }

        System.out.println("Ans: "+ans);
        sc.close();/////...,.,,,,,,,,;;;;..../////


    }
}