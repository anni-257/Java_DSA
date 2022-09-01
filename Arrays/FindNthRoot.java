public class FindNthRoot {
    public static int NthRoot(int n, int m)
	{
	    int l=0,h=m;
	    int mid=l+(h-l)/2;
	    int ans=0;long val=1;
	    while(l<=h){
	        val=1;
	        for(int i=0;i<n;i++){
	           val*=mid;
	        }
	        
	        if(val==m){
	            return mid;
	        }else if(val<m){
	            ans=mid;
	            l=mid+1;
	        }else{
	            h=mid-1;
	        }
	        
	        mid=l+(h-l)/2;
	    }
	    
	    return ans;
	    
	    
	}  
    public static void main(String arg[]){
        int n=6,m=4096;
        int ans=NthRoot(n, m);
        System.out.println("Ans: "+ans);
    }
}
