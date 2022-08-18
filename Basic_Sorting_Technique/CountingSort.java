public class CountingSort{

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }

    public static void countingSort(int arr[]){
        int maxi=arr[0];
        int mini=arr[0];
        for(int i=1;i<arr.length;i++){
            if(maxi<arr[i]){
                maxi=arr[i];
            }else if(mini>arr[i]){
                mini=arr[i];
            }
        }
        int freq[]=new int[maxi-mini+1];

        for(int i=0;i<arr.length;i++){
            freq[arr[i]-mini]++;
        }
        int cnt=0;
        for(int i=0;i<freq.length;i++){
            while(freq[i]>0){
                arr[cnt++]=i+mini;
                freq[i]--;
            }
        }

    }
    public static void main(String arg[]){
        int arr[]={7,32,5,4,3,2,2,3,4,-1,-1,-1,-4,-8,5,2,1,8,9,-100,-65,76,2,23,3,2};
        countingSort(arr);
        print(arr);

    }
}