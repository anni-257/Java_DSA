public class SelectionSort{
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int smallEleIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallEleIndex]>arr[j]){
                    smallEleIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[smallEleIndex];
            arr[smallEleIndex]=temp;
        }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
    public static void main(String arg[]){
        int arr[]={123,1,223,4,54,32,6,7};
        selectionSort(arr);
        print(arr);
    }
}