
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
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;

    }
    public void add(int index,int data){
        if(index==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        Node temp=head;
        if(head==null){
            return;
        }
        for(int i=0;i<index-1 && temp!=null ;i++){
            temp=temp.next;
        }

        if(temp!=null){
            newNode.next=temp.next;
            temp.next=newNode;
        }
    }
    public int length(){
        Node temp=head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }

        return cnt;
    }
    public void print(){
        System.out.println("<-----LinkedList----->");
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]){
        LinkedList ll=new LinkedList();
        ll.print();
        ll.addFirst(50);
        ll.addFirst(40);
        ll.addFirst(30);
        ll.addFirst(20);
        System.out.println("Size of LinkedList: "+ll.length());
        ll.addFirst(10);
        ll.addLast(100);
        ll.addFirst(0);
        ll.addLast(110);
        ll.add(9, 1000);
        ll.print();
        System.out.println("Size of LinkedList: "+ll.length());


    }
}