import java.util.Scanner;

public class LargestOfThree{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int largest;
        
        if(a>b){
            if(a>c){
                largest=a;
            }else{
                largest=c;
            }
        }else{
            if(b>c){
                largest=b;
            }else{
                largest=c;
            }
        }

        System.out.println("Largest of three number is: "+largest);
        sc.close();
    }
}