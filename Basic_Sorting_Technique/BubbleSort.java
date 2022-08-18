public class BubbleSort{
    public static void bubbleSort(int arr[]){
        
        for(int i=0;i<arr.length-1;i++){
            int flag=0;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0){
                break;
            }
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,4,8};
        bubbleSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}