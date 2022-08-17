public class MaxMinSubArraySum{
    public static int maxSubArraySum(int arr[]){
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                maxi=Math.max(maxi,sum);
            }
        }

        return maxi;
    }

    public static int minSubArraySum(int arr[]){
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                mini=Math.min(mini,sum);
            }
        }

        return mini;
    }
    public static void main(String arg[]){
        int arr[]={1,-1,4,3,-2,1,1,1,-6};

        int ans=maxSubArraySum(arr);
        System.out.println("Maximum sum of array: "+ans);
        int ans2=minSubArraySum(arr);
        System.out.println("Minimum sum of array: "+ans2);


    }
}