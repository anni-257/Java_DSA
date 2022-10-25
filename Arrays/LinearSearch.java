import java.util.Scanner;
class LinearSearch{

    public static int findIndex(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                return i;
            }
        }

        return -1;
    }

    public static void print(int arr[]){
        System.out.println("Array Element are: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int numbers[]={44,07,53,34,37,66,63,25,58,67};
        print(numbers);
        System.out.println("Enter the key that to be find: ");
        int key=sc.nextInt();

        int index=findIndex(numbers,key);
        if(index==-1){
            System.out.println("Element is not found..!!");
        }else{
            System.out.println("Element is found at: "+index);
        }

    }
}