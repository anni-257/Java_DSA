class RainWater_Trapping{
    public static int trappedWater(int elevation[]){
        int len=elevation.length;
        int leftMax[]=new int[len];
        int rightMax[]=new int[len];

        leftMax[0]=elevation[0];
        for(int i=1;i<len;i++){
            leftMax[i]=Math.max(leftMax[i-1],elevation[i]);
        }
        rightMax[len-1]=elevation[len-1];
        for(int i=len-2;i>-1;i--){
            rightMax[i]=Math.max(rightMax[i+1],elevation[i]);
        }

        int tw=0,wl=0,width=1;
        for(int i=0;i<len;i++){
            wl=Math.min(leftMax[i],rightMax[i]);
            tw+=(wl-elevation[i])*width;
        }

        return tw;

    }
    public static void main(String args[]){
        int elevation[]={4,1,0,5,3,1,4};
        System.out.println("Trapped water in bars: "+trappedWater(elevation));
    }
}