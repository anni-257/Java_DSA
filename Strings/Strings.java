import java.util.*;

public class Strings{
    public static void print(String s){
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i)+" "); // charAt
        }System.out.println();
    }
    public static void main(String arg[]){
        char str[]={'A','n','i','k','e','t'};
        String fname="Aniket";
        String lname=new String("Tarale");
        String fullname=fname+" "+lname; //concate
        int length=fullname.length(); // function
        print(fullname);

    }
}