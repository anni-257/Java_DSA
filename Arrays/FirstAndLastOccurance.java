import java.util.*;

public class FirstAndLastOccurance{
    public static int firstOccu(int arr[],int key){
        int si=0,ei=arr.length-1;
        int mid=si+(ei-si)/2;
        int ans=-1;
        while(si<=ei){
            if(arr[mid]==key){
                ans=mid;
                ei=mid-1;
            }else if(key<arr[mid]){
                ei=mid-1;
            }else{
                si=mid+1;
            }
            mid=si+(ei-si)/2;
        }
        return ans;
    }
    public static int lastOccu(int arr[],int key){
        int si=0,ei=arr.length-1;
        int mid=si+(ei-si)/2;
        int ans=-1;
        while(si<=ei){
            if(arr[mid]==key){
                ans=mid;
                si=mid+1;
            }else if(key<arr[mid]){
                ei=mid-1;
            }else{
                si=mid+1;
            }
            mid=si+(ei-si)/2;
        }
        return ans;
    }
    public static int [] firstAndLastOccurance(int arr[],int key){
        int ans[]=new int[2];
        int first=firstOccu(arr, key);
        int last=lastOccu(arr, key);
        ans[0]= first;
        ans[1]= last;

        return ans;
    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,3,3,3,4,4,4,5,6,8,10,10,10,12,12};
        System.out.print("Enter key: ");
        int key=sc.nextInt();
        int ans[]=firstAndLastOccurance(arr, key);
        System.out.println("First Occurance: "+ans[0]);
        System.out.println("Last Occurance: "+ans[1]);
    }
}