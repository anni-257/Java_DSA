import java.util.Scanner;


public class LargestInArray{

    public static void create(int arr[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Numbers");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }

    public static void print(int arr[]){
        Scanner sc=new Scanner(System.in);
       
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }

    public static int maximum(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }

        return max;
    }


    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        create(arr);
        print(arr);
        int max=maximum(arr);
        System.out.println("Max in Array: "+max);
    }


}