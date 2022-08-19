public class BuyAndSellStocks{
    public static int buyAndSellStocks(int arr[]){
        int buyStock=Integer.MAX_VALUE;
        int max=0;

        for(int i=0;i<arr.length;i++){
            if(buyStock<arr[i]){
                int profit=arr[i]-buyStock;
                max=Math.max(max,profit);
            }else{
                buyStock=arr[i];
            }
        }
        return max;
    }
    public static void main(String arg[]){
        int arr[]={7,1,2,3,8,0,3,3,3};
        int ans=buyAndSellStocks(arr);
        System.out.println("Max Profit: "+ans);
    }
}