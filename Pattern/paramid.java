import java.util.*;

public class paramid {
    public static void print(int n){
        int row=n;
        for(int i=0;i<n;i++){
            int j;
            for(j=0;j<n-1-i;j++){
                //space
                System.out.print(" ");
            }

            for(int k=0;k<i+1;k++){
                System.out.print("* ");
            }System.out.println();

    }
}
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt() ;
        print(n);

    }
}
