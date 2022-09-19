import java.util.Scanner;

public class ArrayCreation{
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void input(int arr[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Elements");
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        sc.close();

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int size=sc.nextInt(); 
        int arr[]=new int[size];
        print(arr);
        input(arr);
        print(arr);

        sc.close();

    }
}
