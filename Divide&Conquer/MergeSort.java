
class MergeSort{

    public static void print(int arr[]){
        System.out.println("---Array---");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }

    public static void mergeSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;

        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);

        merge(arr,si,mid,ei);
    }

    public static void merge(int arr[],int si,int mid,int ei){

        int len1=mid-si+1;
        int len2=ei-mid;

        int arr1[]=new int[len1];
        int arr2[]=new int[len2];

        int temp=si;
        for(int i=0;i<len1;i++){
            arr1[i]=arr[temp++];
        }
        for(int i=0;i<len2;i++){
            arr2[i]=arr[temp++];
        }
        int i=0,j=0,k=si;
        while(i<len1 && j<len2){
            if(arr1[i]<arr2[j]){
                arr[k++]=arr1[i++];
            }else{
                arr[k++]=arr2[j++];
            }
        }

        while(i<len1){
            arr[k++]=arr1[i++];
        }
        while(j<len2){
            arr[k++]=arr2[j++];
        }
        
    /* 
        int len=ei-si+1;
        int temp[]=new int[len];
        
        int i=si,j=mid+1,k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
            }
        }

        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        for(int p=0,q=si;p<len;p++){
            arr[q++]=temp[p];
        }
        */

        
    }

    public static void main(String args[]){
        int arr[]={12,32,34,-1,100,-3};
        print(arr);
        mergeSort(arr, 0, arr.length-1);
        print(arr);
        // -3,-1,12,32,34,100

    }
}