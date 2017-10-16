package com.tree.mirror;
class Node
{
    int data;
    Node left, right;
 
    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 
public class BinaryTreeMirror
{
    public Node root;
 
    public BinaryTreeMirror(){
		this.root = null;
	}
    public Node mirror(Node node)
    {
        if (node == null)
            return node;
 
        /* do the subtrees */
        Node left = mirror(node.left);
        Node right = mirror(node.right);
 
        /* swap the left and right pointers */
        node.left = right;
        node.right = left;
 
        return node;
    }
    static boolean checkMirror(Node a, Node b)
    {
    	if(a== null && b==null)
    		return true;

    	if(a== null || b==null)
    		return false;
    	
    	return a.data == b.data && checkMirror(a.left, b.right) && checkMirror(a.right, b.left);
    	
    }

 
    void inOrder()
    {
        inOrder(root);
    }
 
    /* Helper function to test mirror(). Given a binary
       search tree, print out its data elements in
       increasing sorted order.*/
    void inOrder(Node node)
    {
        if (node == null)
            return;
 
        inOrder(node.left);
        System.out.print(node.data + " ");
 
        inOrder(node.right);
    }
 
    /* testing for example nodes */
    public static void main(String args[])
    {
        /* creating a binary tree and entering the nodes */
        BinaryTreeMirror tree = new BinaryTreeMirror();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
 
        /* print inorder traversal of the input tree */
        System.out.println("Inorder traversal of input tree is :");
        tree.inOrder();
        System.out.println("");
        

        BinaryTreeMirror tree1 = new BinaryTreeMirror();
        tree1.root = new Node(1);
        tree1.root.left = new Node(2);
        tree1.root.right = new Node(3);
        tree1.root.left.left = new Node(4);
        tree1.root.left.right = new Node(5);
 

        /* convert tree to its mirror */
        tree.mirror(tree.root);
 
        /* print inorder traversal of the minor tree */
        System.out.println("Inorder traversal of binary tree is : ");
        tree.inOrder();
        System.out.println();
        tree1.inOrder();
        
        System.out.println(checkMirror(tree.root, tree1.root));
 
    }
}