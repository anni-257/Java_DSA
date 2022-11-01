class Permutation{
    public static void permutation(String str,String out){
        if(str.length()==0){
            System.out.println(out);
            return;
        }

        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String newString=str.substring(0, i)+str.substring(i+1);

            permutation(newString, out+curr);

        }

    }
    public static void main(String args[]){
        String str="abc";
        permutation(str,"");
    }
}