import java.util.*;
public class RainWater_Trapping{

    public static int rainWater_Trapping(int arr[]){
        int len=arr.length;
        int ans=0;
       int leftMax[]=new int[len];
       int rightMax[]=new int[len];

       leftMax[0]=arr[0];
       for(int i=1;i<len;i++){
            if(leftMax[i-1]<arr[i]){
                leftMax[i]=arr[i];
            }else{
                leftMax[i]=leftMax[i-1];
            }
       }

       rightMax[len-1]=arr[len-1];
       for(int i=len-2;i>=0;i--){
            if(rightMax[i+1]<arr[i]){
                rightMax[i]=arr[i];
            }else{
                rightMax[i]=rightMax[i+1];
            }
       }

      for(int i=0;i<len;i++){
        int wl=Math.min(leftMax[i],rightMax[i]);
        ans+=(wl-arr[i]);
      }

       return ans;

    }
    public static void main(String arg[]){
        int arr[]={1,4,3,2,6,4,3};

        int ans=rainWater_Trapping(arr);
        System.out.println("Ans: "+ans);
    }
}