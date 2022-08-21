import java.util.*;
public class IsPalindrome{

    public static boolean isPalindrome(String s){
        int si=0,ei=s.length()-1;
        while(si<ei){
            if(s.charAt(si)!=s.charAt(ei)){
                return false;
            }
            si++;ei--;
        }
        return true;
    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String to check: ");
        String input=sc.nextLine();
        boolean ans=isPalindrome(input);
        System.out.println("This given string "+input+" is palindrome?: "+ans);
    }
}