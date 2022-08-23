import java.util.*;
public class FindInSortedArray{
    public static boolean FindElementInArray(int arr[],int key){
        int l=0,h=arr.length-1;
        int mid=l+(h-l)/2;
        while(l<=h){
            if(arr[mid]==key){
                return true;
            }
            else if(arr[l]<arr[mid]){
                if(arr[l]<=key && key<arr[mid]){
                    h=mid-1;
                }else{
                    l=mid+1;
                }
            }else{
                if(arr[mid]<key && key<=arr[h]){
                    l=mid+1;
                }else{
                    h=mid-1;
                }
            }

            mid=l+(h-l)/2;
        }
        return false;
    }
    public static void main(String args[]){
        int arr[]={10,11,15,20,2,5,7,8};
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
        boolean ans=FindElementInArray(arr, key);
        if(ans){
            System.out.println("Element found!!");
        }else{
            System.out.println("Element not found!!");
        }

    }
}