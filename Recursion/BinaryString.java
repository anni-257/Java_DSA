import javax.naming.spi.DirStateFactory.Result;

class BinaryString{

    public static void solve(int n,String str,int idx){
        if(n==0){
            System.out.println(str);
            return;
        }

        if(str.charAt(idx-1)=='1'){
            solve(n-1, str+"0", idx+1);
        }else{
            solve(n-1, str+"0", idx+1);
            solve(n-1, str+"1", idx+1);
        }

    }
    public static void main(String args[]){
    //    StringBuilder str=new StringBuilder("x");
    String str=" ";
       solve(4,str,1);

    }
}