class RemoveDuplicates{

    public static void effRemove(String str,int idx,StringBuilder newStr,boolean map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar=str.charAt(idx);

        if(map[currChar-'a']==true){ 
            effRemove(str, idx+1, newStr, map);
        }else{
            map[currChar-'a']=true;
            effRemove(str, idx+1, newStr.append(currChar), map);
        }
    }

    public static String removeDuplicate(String str,String ans,int index){
        if(str.length()==index){
            return ans;
        }

        int found=0;
        for(int i=0;i<index;i++){
            if(str.charAt(i)==str.charAt(index)){
                found=1;
                break;
            }
        }

        if(found!=1){
            ans+=str.charAt(index);
        }

        return removeDuplicate(str, ans, index+1);
    }
    public static void main(String args[]){
        String str="appnnacollege";
        // String ans="";
        // ans=removeDuplicate(str,ans,0);
        // System.out.println(ans);
        boolean map[]=new boolean[26];
       
        effRemove(str, 0,new StringBuilder(""), map);


    }
}