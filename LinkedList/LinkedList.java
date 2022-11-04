
public class LinkedList{
    public class Node{
        int val;
        Node next;
        public Node(int data){
            this.val=data;
            this.next=null;
        }
    }

    public Node head;
    public Node tail;

    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }

        newNode.next=head;
        head=newNode;
    }
    public static void main(String args[]){
        
    }
}