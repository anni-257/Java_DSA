import java.util.*;
class Node{
    int data;
    Node lchild;
    Node rchild;

    public Node(int val){
        data=val;
        lchild=rchild=null;
    }
}

class BinaryTree{
    Node root;
    int nodes[];
    Scanner sc=new Scanner(System.in);
    public void create(){
        
        System.out.println("Enter number of nodes available in tree");
        int n=sc.nextInt();
        nodes=new int[n];

        System.out.println("Enter all nodes");
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            nodes[i]=x;
        }
    }

    public void findChilds(){
        
    
            System.out.print("Enter Node index: ");
            int i=sc.nextInt();

            while(i!=-1){
                System.out.println("Parent Node: "+nodes[i]);
                System.out.println("Left Child Node: "+nodes[i*2+1]);
                System.out.println("Right Child Node: "+nodes[i*2+2]);
                System.out.print("Enter Node index: ");
                i=sc.nextInt();
            }
            
        

        

    }

}

class Create{
    public static void main(String args[]){
        BinaryTree b1=new BinaryTree();
        b1.create();
        b1.findChilds();
    }
}