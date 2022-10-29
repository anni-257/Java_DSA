class FriendsPairing{
    public static int frndspairing(int n){
        if(n==1 || n==2){
            return n;
        }
        //choices
        //single 
        int fnm1=frndspairing(n-1);

        //pair
        int fnm2=(n-1)*frndspairing(n-2);

        int totWays=fnm1+fnm2;

        return totWays;

    }
    public static void main(String args[]){
        int n=3;
        System.out.println("No. of ways are: "+frndspairing(n));
    }
}