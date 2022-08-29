import java.util.*;
public class ShortestDist{
    public static double shortestDist(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            switch(str.charAt(i)){
                case 'N':y++;break;
                case 'S':y--;  break;
                case 'E':x++;  break;
                case 'W':x--;break;
            }
        }

        return Math.sqrt(((x*x)+(y*y)));
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        double ans=shortestDist(str); 
        
        System.out.println("Shortest Distance : "+ans);
    }
}