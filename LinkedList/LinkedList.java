

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
    public static int size;

    public void addFirst(int data){
        size++;
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }

        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        size++;
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
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
            size++;
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
    public int removeFirst(){
        if(size==0){
            System.out.println("LL is already empty..!!");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.val;
            head=tail=null;
            size=0;
            return val;
        }
       
        int val=head.val;
        head=head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("LL is already empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.val;
            head=tail=null;
            size--;
            return val;
        }
        Node temp=head;
        for(int i=0;i<size-2;i++){
            temp=temp.next;
        }
        int val=temp.next.val;
        tail=temp;
        temp.next=null;
        size--;
        return val;

    }
    public int itrSearch(int data){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(data==temp.val){
                return i;
            }
            i++;
            temp=temp.next;
        }

        return -1;

    }
    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }

        if(head.val==key){
            return 0;
        }
        int idx=helper(head.next, key);
        if(idx==-1){
            return -1;
        }

        return idx+1;
    }
    public int recSearch(int key){
       return helper(head,key);
    }
    public void reverseList(){

        Node newHead=null;

        while(head!=null){
            Node next=head.next ;
            head.next=newHead;
            newHead=head;
            head=next;
        }

        head=newHead;
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
        ll.removeFirst();
        ll.removeLast();
        ll.addFirst(50);
        ll.removeFirst();
        ll.removeLast();
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
        System.out.println("search for 40: "+ll.recSearch(20));
        System.out.println("search for 40: "+ll.itrSearch(130));
        System.out.println("Size of LinkedList: "+ll.length());
        
        System.out.println("Removed last element of data: "+ll.removeLast());
        ll.print();
        ll.reverseList();
        ll.print();
        System.out.println("Size of LinkedList: "+ll.length());

    }
}