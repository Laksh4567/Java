// Build tree preorder  
import java.util.*;
public class tree{
    static class Node{
        int data;
        Node left;
        Node right;
// constructor hai yeah
        Node(int data){
            this.data=data;
            this.left= null;
            this.right= null;

        }
    }
    static class BinaryTree{
        static int index=-1;
        public static Node buildtree(int node[]){
            index++;
            if(node[index]==-1){
                return null;
            }
            Node newNode=new Node(node[index]);
            newNode.left=buildtree(node); 
            newNode.right=buildtree(node);

            return newNode;
        }
    }// to return root node 
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void levelOrderTraversal(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q=new LinkedList<>();// concept of programming in the interface, we have used linkedlist as each element (node) in the list holds references to both the next and the previous elements.
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node curr=q.remove();
            if(curr==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(curr.data+" ");
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
    }
    public static int countNode(Node root){
        if(root==null){
            return 0;
        }
        int left=countNode(root.left);
        int right=countNode(root.right);

        return (left+right+1);
    }
    public static int SumOfNodes(Node root){
        if(root==null){
            return 0;
        }
        int left=SumOfNodes(root.left);
        int right=SumOfNodes(root.right);

        return(left+right+root.data);
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);

        return Math.max(left, right)+1;
    }
    //imporant for the company questions, there are two case stated as 1) pass through root  2) does not pass through the root
    public static int Diameter(Node root){// Approach 1 0(n^2)
        if(root==null){
            return 0;
        }
        int diam1=Diameter(root.left);
        int diam2=Diameter(root.right);
        int diam3=height(root.left)+height(root.right)+1;

        return Math.max(diam1, Math.max(diam2, diam3));
    }
    public static void main(String args[]){
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root=BinaryTree.buildtree(node);
        System.out.println(root.data);
        preorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        levelOrderTraversal(root);
        System.out.println(countNode(root));
        System.out.println(SumOfNodes(root));
        System.out.println(height(root));
        System.out.println(Diameter(root));
    }
}


//Subtree of a tree,imporant for the company questions.