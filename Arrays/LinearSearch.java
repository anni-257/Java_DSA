import java.util.Scanner;


public class LinearSearch{

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

    public static boolean linearSearch(int arr[], int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return true;
            }
        }
        return false;
    }


    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        create(arr);
        print(arr);
        System.out.print("Enter key to be find: ");
        int key=sc.nextInt();
        boolean ans=linearSearch(arr, key);
        if(ans){
            System.out.println("Found");
        }else{
            System.out.println("not Found");
        }
    }


}