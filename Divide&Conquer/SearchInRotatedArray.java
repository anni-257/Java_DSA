import java.util.Scanner;

class SearchInRotatedArray{

    public static int searchInRotatedArray(int arr[],int si,int ei,int target){
        if(si>ei){
            return -1;
        }
        // calculate mid
        int mid=si+(ei-si)/2;

        if(target==arr[mid]){
            return mid;
        }

        // mid on L1
        if(arr[si]<arr[mid]){
            if(arr[si]<=target && target<arr[mid]){
                return searchInRotatedArray(arr, si, mid-1, target);
            }else{
                return searchInRotatedArray(arr, mid+1, ei, target);
            }
        }else{
            if(arr[mid]<target && target<arr[ei]){
                return searchInRotatedArray(arr, mid+1, ei, target);
            }else{
                return searchInRotatedArray(arr, si, mid-1, target);
            }
        }

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={4,5,6,7,0,1,2};
        System.out.print("Enter target key: ");
        int target=sc.nextInt();
        System.out.println("Index of target element: "+searchInRotatedArray(arr, 0,arr.length-1, target));
    }
}