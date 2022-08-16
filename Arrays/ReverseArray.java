import java.util.*;


public class ReverseArray{

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

    public static void reverseArray(int arr[]){
        int i=0,j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
    }


    public static void main(String arg[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        create(arr);
        System.out.println("Before Reverse");
        print(arr);
        reverseArray(arr);
        System.out.println("After Reverse");
        print(arr);

        
    }


}