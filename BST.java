import java.util.*;
public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
        this.data = data;
    }
    }
    public static Node insert(Node root, int val) {
        if(root == null) {
            root = new Node(val);
            return root;
        }
        if(root.data>val){
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root ){
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static boolean search(Node root, int val) {
        if(root==null){
            return false;
        }
        if(root.data>val){
            return search(root.left, val);
        }
        else if(root.data==val){
            return true;
        }
        else{
            return search(root.right,val);
        }
    }
    public static Node delete(Node root,int val) {
        if(root.data>val){
            root.left = delete(root.left, val);
        }
        else if(root.data<val){
            root.right = delete(root.right, val);
        }else{// root.data == val
            if(root.left == null && root.right == null) {
                return null;
            }
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            Node IS=inorderSuccessor(root.right);
            root.data=IS.data;
            root.right=delete(root.right, IS.data);

        }
        return root;
    }
    public static Node inorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    public static void findtherange(Node root,int X,int Y){
        if(root==null){
            return;
        }
        if(root.data>=X && root.data<=Y){
            findtherange(root.left,X,Y);
            System.out.println(root.data+" ");
            findtherange(root.right,X,Y);
        }
        else if(root.data<=Y){
            findtherange(root.left, X, Y);
        }else{
            findtherange(root.right, X, Y);
        }
    }
    public static void printPath(ArrayList<Integer>path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }
    public static void printroot2leaf(Node root,ArrayList<Integer>path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right==null){
            printPath(path);
        }else{
            printroot2leaf(root.left, path);
            printroot2leaf(root.right, path);
        }
        path.remove(path.size()-1);
    }
    public static void main(String args[]){
        int values[]={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root, values[i]);
        }
        inorder(root);
        System.out.println();

        // if(search(root,1)){
        //     System.out.println("Element found");
        // }else{
        //     System.out.println("Element not found");
        // }
        //delete(root, 4);
        //inorder(root);
        //findtherange(root, 3, 7);
        printroot2leaf(root,new ArrayList<>());
    }
}
