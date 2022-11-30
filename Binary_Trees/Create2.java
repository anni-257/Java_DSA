import java.util.LinkedList;
import java.util.Queue;

public class Create2 {

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            left=right=null;
        }
    }

    static class BinaryTree{
        static int idx=-1;
        //int number=0;
        public Node buildBtree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildBtree(nodes);
            newNode.right=buildBtree(nodes);

            return newNode;
        }

        public void preOrder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public void inOrder(Node root){
            if(root==null){
                return;
            }
           // number++;
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }

        public void postOrder(Node root){
            if(root==null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }

        public void levelOrder(Node root){
         
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node p=q.remove();
                if(p==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(p.data+" ");
                    if(p.left!=null){
                        q.add(p.left);
                    }
                    if(p.right!=null){
                        q.add(p.right);
                    }
                }
            }

        }

        public int heightOfTree(Node root){

            if(root==null){
                return 0;
            }
            
            int lh=heightOfTree(root.left);
            int rh=heightOfTree(root.right);

            int height=Math.max(lh,rh);

            return height+1;

        }

        public int countNodes(Node root){

            if(root==null){
                return 0;
            }

            int ln=countNodes(root.left);
            int rn=countNodes(root.right);

            return ln+rn+1;
        }

        public int sumOfNodes(Node root){
            if(root==null){
                return 0;
            }

            int ls=sumOfNodes(root.left);
            int rs=sumOfNodes(root.right);

            return ls+rs+root.data;
        }

        public static class Info{
            int diam;
            int ht;

            public Info(int diam,int ht){
                this.diam=diam;
                this.ht=ht;
            }
        }

        public Info diameterHeight(Node root){
            if(root==null){
                return new Info(0,0);
            }

            Info ld=diameterHeight(root.left);
            Info rd=diameterHeight(root.right);

            int diam=Math.max(Math.max(ld.diam,rd.diam),ld.ht+rd.ht+1);
            int ht=Math.max(ld.ht,rd.ht)+1;

            return new Info(diam, ht);

        }

        public boolean isSubTree(Node root,Node subRoot){
            if(root==null){
                return false;
            }
            if(root.data==subRoot.data){
                if(isIdentical(root,subRoot)){
                    return true;
                }
            }

            return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
        }


    }
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildBtree(nodes);
        System.out.println("---PreOrder---");
        tree.preOrder(root);
        System.out.println();
        System.out.println("---InOrder---");
        tree.inOrder(root);
        System.out.println();
        System.out.println("---PostOrder---");
        tree.postOrder(root);
        System.out.println();
        System.out.println("---> Height Of Tree: "+tree.heightOfTree(root));
        System.out.println("Number of Nodes--: "+tree.countNodes(root));
        System.out.println("---Level Order Traversal---");
        tree.levelOrder(root);
        System.out.println("sum of all nodes: "+tree.sumOfNodes(root));

        BinaryTree.Info n=tree.diameterHeight(root);
        System.out.println("Height: "+n.ht);
        System.out.println("Diameter: "+n.diam);




    }
}
