
public class LargestInArray{

    public static void print(int arr[]){
        System.out.print("Elements of array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }

    public static int maxElement(int arr[]){
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(maxi<arr[i]){
                maxi=arr[i];
            }
        }

        return maxi;
    }
    public static void main(String args[]){
        int nums[]={11,22,33,44,55,100,66,300,43,23};
        // System.out.println("");
        print(nums);
        int ans=maxElement(nums);
        System.out.println("Largest number in an Array: "+ans);


    }
}