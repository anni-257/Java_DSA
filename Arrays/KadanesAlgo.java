public class KadanesAlgo{
    public static int MaxSubarraySum(int arr[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs+=arr[i];
            if(cs<0){
                cs=0;
            }
             ms=Math.max(ms, cs)  ;
        }

        return ms;
    }
    public static  void main(String arg[]){
        int arr[]={1,-2,3,10,-6,4,100};
        int ans=MaxSubarraySum(arr);
        System.out.println("Max Subarray Sum: "+ans);
    }
}