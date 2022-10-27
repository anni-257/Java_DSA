
class MinMaxSubArrayPrefixSum{

    public static int maxSubArraySum(int []arr){
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int currSum= i==0 ? prefix[j] : prefix[j]-prefix[i-1];
                maxSum=Math.max(maxSum,currSum);
            }
        }

        return maxSum;
    }

    public static int minSubArraySum(int []arr){

        int minSum=Integer.MAX_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];

        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int currSum= i==0 ? prefix[j]: prefix[j]-prefix[i-1];
                minSum=Math.min(minSum,currSum);
            }
        }

        return minSum;

    }
    public static void main(String args[]){
        int arr[]={1,-2,3,4,-6,-3,10};
        int min=minSubArraySum(arr);
        int max=maxSubArraySum(arr);
        System.out.println("Minimum subArray value is: "+min);
        System.out.println("Maximum subArray value is: "+max);
    }
}