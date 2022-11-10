
import java.util.*;
class StackB{
    
    
    /* implementation of stack using LinkedList

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Stack{
        /* Implementation Using ArrayList
         ArrayList<Integer> list=new ArrayList<>();
        public boolean isEmpty(){
            if(list.size()==0){
                return true;
            }

            return false;
        }
        public void push(int data){
            list.add(data);
        }
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size());
        }
    }
    public static void main(String args[]){
        Stack st=new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
         */
        /* 
        Node top=null;

        public boolean isEmpty(){
            return top==null;
        }

        public void push(int data){
            Node newNode=new Node(data);
            if(isEmpty()){
                top=newNode;
            }
            newNode.next=top;
            top=newNode;
        }

        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int temp=top.data;
            top=top.next;
            return temp;

        }

        public int peek(){
            if(isEmpty()){
                return -1;
            }

            return top.data;
        }


    }
    public static void main(String args[]){
        Stack st=new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        System.out.println(st.peek());
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
        System.out.println(st.pop());
        System.out.println(st.peek());
    }
     
    */

    public static void bottomPush(Stack<Integer> st,int data){
        if(st.isEmpty()){
            st.push(data);
            return;
        }

        int temp=st.pop();
        bottomPush(st, data);
        st.push(temp);
    }

    public static String reverseString(String str){
        Stack<Character> st=new Stack<>();
        int idx=0;
        while(idx<str.length()){
            char curr=str.charAt(idx);
            st.push(curr);
            idx++;
        }
        StringBuilder newStr=new StringBuilder("");
        while(!st.isEmpty()){
            char curr=st.pop();
            newStr.append(curr);
        }

        return newStr.toString();


    }

    public static void reverseStack(Stack<Integer>st){
        if(st.isEmpty()){
            return;
        }

        int temp=st.pop();
        reverseStack(st);
        bottomPush(st, temp);
    }

    public static void main(String args[]){
        Stack<Integer>st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        // bottomPush(st,50);
       
        reverseStack(st);
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }

        String name="Aniket";
        System.out.println(name);
        name=reverseString(name);
        System.out.println(name);

    }
    
        
}