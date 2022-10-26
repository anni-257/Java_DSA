class PrintSubArrays{
    public static int minSubArraySum(int arr[]){

        int min=Integer.MAX_VALUE;
        for(int s=0;s<arr.length;s++){
            for(int e=s;e<arr.length;e++){
                int sum=0;
                for(int k=s;k<=e;k++){
                    sum+=arr[k];
                }

                min=Math.min(min,sum);
            }
        }

        return min;
    }

    public static int maxSubArraySum(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int s=0;s<arr.length;s++){
            for(int e=s;e<arr.length;e++){
                int sum=0;
                for(int k=s;k<=e;k++){
                    sum+=arr[k];
                }
                max=Math.max(max,sum);
            }
        }

        return max;
    }

    public static void printSubArrays(int arr[]){
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                System.out.print("{");
                for(int k=start;k<=end;k++){ // printing SubArrays
                    if(k!=end)
                        System.out.print(arr[k]+",");
                    else
                        System.out.print(arr[k]);
                }
                System.out.println("}");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        System.out.println("SubArrays");
        printSubArrays(arr);
        System.out.println("Minimum sum of subArray is: "+minSubArraySum(arr));
        System.out.println("Maximum sum of subArray is:  "+maxSubArraySum(arr));
    }
}