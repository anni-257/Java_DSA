public class Example{
    public static void main(String args[]){
        int arr[]={1,4,2,5,3};

        // subarray,subset,subsequence
         
        

        // for(int i=0;i<arr.length;i++){ // start
        //     for(int j=i;j<arr.length;j++){ // end
        //         for(int k=i;k<=j;k++){ //printing 
        //             System.out.print(arr[k]+" ");
        //         }
        //         System.out.println();
        //     }
        // } //O(n^3)

        int preSum[]=new int[arr.length];
        preSum[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            preSum[i]=preSum[i-1]+arr[i];
        }

        // 1 5 7 12 15 

        int ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){

                int sum= (i==0) ? preSum[j] : preSum[j]-preSum[i-1];
                

                if((j-i+1)%2!=0){  // 1 2 3 4 5
                    ans+=sum;
                }
            }
        }
        System.out.println("Ans: "+ans);

        //O(n^2)

        // O(N) 



        
    }
}