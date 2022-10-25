import java.util.Scanner;


class BinarySearch{
    public static void print(int arr[]){
        System.out.println("Array Elements are: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int binarySearch(int arr[],int target){
        int low=0,high=arr.length-1;
        int mid=low+(high-low)/2;

        while(low<=high){
            if(target==arr[mid])
            {
                return mid;
            }
            else if(arr[mid]<target)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
            
            mid=low+(high-low)/2;
        }

        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int nums[]={1,2,10,30,45,56,68,90};
        System.out.println(">>>>> Binary Search <<<<<");
        print(nums);
        System.out.print("Enter number to be search: ");
        int key=sc.nextInt();

        int index=binarySearch(nums,key);
        if(key==-1){
            System.out.println("Element is not found..!!");
        }else{
            System.out.println("Element is found at index of "+index);
        }



    }


}