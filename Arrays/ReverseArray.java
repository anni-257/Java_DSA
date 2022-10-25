class ReverseArray{

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }

    public static void reverse(int arr[]){
        int i=0,j=arr.length-1;

        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
    }
    public static void main(String args[]){
        
        int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.print("Array before reverse: ");
        print(arr);
        reverse(arr);
        System.out.print("Array after reverse:  ");
        print(arr);
    }
}