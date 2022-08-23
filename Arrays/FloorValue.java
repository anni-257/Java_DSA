import java.util.*;
public class FloorValue{
    public static int floorValue(int arr[],int key){
        int l=0,h=arr.length-1;
        int mid=l+(h-l)/2;
        int ans=-1;
        while(l<=h){
            if(arr[mid]==key){
                return key;
            }else if(arr[mid]<key){
                ans=arr[mid];
                l=mid+1;
            }else if(arr[mid]>key){
                h=mid-1;
            }
            mid=l+(h-l)/2;
        }
        return ans;
    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,6,7,8};
        
        System.out.print("Enter key: ");
        int key=sc.nextInt();
        int ans=floorValue(arr,key);
        System.out.println("Floor value of "+ans);
    }
}