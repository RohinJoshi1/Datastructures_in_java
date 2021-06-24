/**
 * BST
 */
import java.util.*;
 public class BinarySearchTree {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        tree.insert(10);
        tree.insert(15);
        tree.insert(20);
        tree.insert(25);
        tree.inorder();
       

    }

     
    


    class Node
     {
         int key;
         Node left,right;
         
         public Node(int key)
         {
             this.key=key;
             
         }
     }
     
     
         public Node root;
         public void insert(int key)
         {
             Node node = new Node(key);
             if(root==null)
             {
                 root= node;
                 return;
             }
             Node prev =null;
             Node temp = root;
             while(temp!=null)
             {
                 if(temp.key>key)
                 {prev = temp;
                 temp = temp.left;
                 }
                 else if(temp.key<key)
                 {
                    prev = temp;
                    temp = temp.right;

                 } 
             }  
                 if(prev.key>key)
                 {
                     prev.left=node;

                 }
                 else
                 {
                     prev.right = node;
                 }
             }
         
         public void inorder()
         {
             Node temp = root;
             Stack<Node> stack = new Stack<>();
             while(temp!=null||!stack.isEmpty())
             {
                if(temp!=null){
                    stack.add(temp);
                    temp=temp.left;
                }
                else {
                    temp=stack.pop();
                    System.out.print(temp.key +" ");
                    temp=temp.right;
                }
             }
         }
     
    public  Node Search(Node root,int key)
    {
        if(root==null || root.key ==key)
        {
            return root;
        }
        if (root.key<key)
        {
            return Search(root.right,key);
        }
        return Search(root.left, key);
    }}

    //insertion
    // BST()
    // {
    //     root=null;
    // }
    // void insert(int key)
    // {
    //     root = insertRec(root,key);
    // }
    // Node insertRec(Node root,int key)
    // {
    //     if(root==null)
    //     {
    //         root = new Node(key);
    //         return root;
    //     }
    //     if(key<root.key)
    //     {
    //         root.left=insertRec(root.left,key);

    //     }
    //     else if(key>root.key)
    //     {
    //         root.right=insertRec(root.right,key);
    //     }
    //     return root;
    // }
    // void inorder()
    // {
    //     inorderRec(root);
    // }
    // void inorderRec(Node root)
    // {
    //     if(root!=null)
    //     {
    //         inorderRec(root.left);
    //         System.out.println(root.key);
    //         inorderRec(root.right);
    //     }
    // }
    // public static void print()
    // {
    //  printTree(root);
    // }
    // public static void printTree(Node root)
    // {
    //     if(root==null)
    //     {return;}
    //     if(root.left==null && root.right==null)
    //     {
    //         System.out.println(root.key);

    //     }
    //    printTree( root.left);
    //   printTree( root.right);
    // }
    


