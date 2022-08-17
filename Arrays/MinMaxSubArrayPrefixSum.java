public class MinMaxSubArrayPrefixSum{
    public static int minSubArraySum(int arr[]){
        int maxi=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        for(int i=0;i<arr.length;i++){
            int currentSum=0;
            for(int j=i;j<arr.length;j++){
                currentSum=i==0?prefix[j]:prefix[j]-prefix[i-1];
                if(maxi<currentSum){
                    maxi=currentSum;
                } 
            }
            
        }

        return maxi;
    }
    public static void main(String arg[]){
        int arr[]={1,-2,6,-1,3};
        int ans=minSubArraySum(arr);
        System.out.println("Maximum sum of subArray: "+ans);
    }
}