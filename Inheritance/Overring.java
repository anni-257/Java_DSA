
class Tv
{
    public void switchOn(){System.out.println("Tv... Switch On");}
    public void changeChannel(){System.out.println("Tv.. Channel Changed");}
}

class SmartTv extends Tv
{
    public void switchOn(){System.out.println("SmartTv.. Switch On");}
    public void changeChannel(){System.out.println("SmartTv.. Channel Changed");}
    public void browse(){System.out.println("SmartTv.. Suffering");}
}

public class Overring 
{
    public static void main(String args[]){
        Tv t=new Tv();
        SmartTv st=new SmartTv();
        Tv ts=new SmartTv();

        t.switchOn();
        st.switchOn();
        ts.switchOn();
        

        
        
        

    }
}
