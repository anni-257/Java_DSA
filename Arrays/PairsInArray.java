class PairsInArray{
    public static int pairs(int arr[]){
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+", "+arr[j]+")");
                cnt++;
            }System.out.println();
        }

        return cnt;
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};

        System.out.println("Total number of pairs in Array: "+pairs(arr));


    }
}