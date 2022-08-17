
public class PairsInArray{
    public static int pairsInArray(int arr[]){
        int cnt=0;
        for(int i=0;i<arr.length-1;i++){
            int ele=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+ele+","+arr[j]+") ");
                cnt++;
            }System.out.println();
        }
        return cnt;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int len=pairsInArray(arr);
        System.out.println("No. Of Pairs in Array: "+len);
    }
}
