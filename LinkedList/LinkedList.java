

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
        Node prev=null;
        tail=head;
        while(head!=null){
            Node next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }

        head=prev;
    }
    public Node recReverseNodes(Node head){
        if(head==null || head.next==null){
            return head;
        }

        Node newHead=recReverseNodes(head.next);
        head.next.next=head;
        head.next=null;

        return newHead;
    }
    public void recReverseList(){
        tail=head;
        head=recReverseNodes(head);
    }

    public void deleteNodeFromEnd(int n){
        
        int ifrmStr=size-n;
        if(n==size){
            head=head.next;
            size--;
            return;
        }
        Node prev=head;
        int i=0;
        while(i<ifrmStr-1){
            prev=prev.next;
            i++;
        }

        prev.next=prev.next.next;
        size--;
    }
    public void helperDeleteNodeFromEnd(Node temp, int arr[]){
        if(temp==null){
            return ;
        }

        helperDeleteNodeFromEnd(temp.next,arr);
        
        arr[0]--;
        System.out.println(arr[0]);
        if(arr[0]==-1){
            temp.next=temp.next.next;
            return;
        }
    }

    public void recDeleteNodeFromEnd(int n){
        int arr[]={n};
        helperDeleteNodeFromEnd(head,arr);
        size--;
    }

    public boolean isPalindrome(){
        Node slow,fast,temp=head;
        slow=fast=head;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        slow.next=recReverseNodes(slow.next);
       // print();
        Node temp2=slow.next;

        while(temp2!=null){
            if(temp.val!=temp2.val){
                return false;
            }
            temp=temp.next;
            temp2=temp2.next;
        }
        slow.next=recReverseNodes(slow.next);
        return true;
        

    }

    public void linkNodes(int str,int des){
      str--;
      Node temp1,temp2;
      temp1=temp2=head;
      while(str!=0){
        temp1=temp1.next;
        str--;
      }
      des--;
      while(des!=0){
        temp2=temp2.next;
        des--;
      }
      
      temp2.next=temp1;

    }
    public boolean isCycle(){
        if(head==null){
            return false;
        }
        Node slow,fast;
        slow=fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
        }

        return false;
    }
    public void removeCycle(){
        if(head==null){
            return;
        }
        Node slow,fast;
        slow=fast=head;
        boolean flag=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.println("Cycle is not present");
            return;
        }
        Node start=slow;
        while(start!=fast){
            start=start.next;
            fast=fast.next;
        }

        Node temp=fast;
        while(fast.next!=temp){
            fast=fast.next;
        }

        fast.next=null;
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
       /*
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
        ll.recReverseList();
        ll.print();
        //ll.deleteNodeFromEnd(3);;
        ll.recDeleteNodeFromEnd(3);
        ll.print();
        System.out.println("Size of LinkedList: "+ll.isPalindrome());

        LinkedList lll=new LinkedList();
        lll.addFirst(10);
        lll.addFirst(20);
        lll.addFirst(30);
        lll.addFirst(40);
        lll.addFirst(50);
        lll.addFirst(40);
        lll.addFirst(30);
        lll.addFirst(20);
        lll.addFirst(10);
        System.out.println(lll.isPalindrome());
        lll.print();

        */ 

        LinkedList ll=new LinkedList();

        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addFirst(40);
        ll.addFirst(50);
        ll.addFirst(60);
        ll.addFirst(70);
        ll.addFirst(80);
        ll.print();
        ll.linkNodes(2, 5);
        ll.removeCycle();
        ll.removeCycle();
        System.out.println("isCycle present in LL: "+ll.isCycle());
       


    }
}