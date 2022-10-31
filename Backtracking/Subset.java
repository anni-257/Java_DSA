
class Subset{
    public static void subset(String ip,String op,int idx){
        if(ip.length()==idx){
            System.out.println(op);
            return;
        }

        subset(ip,op,idx+1);
        subset(ip,op+ip.charAt(idx),idx+1);
    }
    public static void main(String args[]){
        String str="abc";
        subset(str,"",0);
    }
}