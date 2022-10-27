class KadanesAlgo{

    public static int MaxSubArraySum(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<arr.length;i++){
            currSum+=arr[i];
            if(currSum<0){
                currSum=0;
            }

            maxSum=Math.max(currSum,maxSum);
        }

        return maxSum;
    }
    public static void main(String args[]){
        int arr[]={-10,-2,-3,4,2,-10,100,10,-130,90};
        int ans=MaxSubArraySum(arr);
        System.out.println("Maximum subArray sum using kadanes algo is: "+ans);
    }
}