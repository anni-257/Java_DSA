
import java.util.Stack;

import javax.sound.midi.Soundbank;
class StockSpan{

    public static void stockSpan(int stocks[],int span[]){
        Stack<Integer> s=new Stack<>();
        span[0]=1;
        s.push(0);

        for(int i=1;i<stocks.length;i++){
            int currStock=stocks[i];
            while(!s.empty() && currStock>=stocks[s.peek()]){
                s.pop();
            }
            if(s.empty()){
                span[i]=i+1;
            }else{
                span[i]=i-s.peek();
            }

            s.push(i);
        }
    }
    public static void main(String args[]){
        int stocks[]={100,80,60,70,60,85,100};
        int span[]=new int[stocks.length];
        stockSpan(stocks,span);

        for(int x:span){
            System.out.print(x+" ");
        }
    }
}