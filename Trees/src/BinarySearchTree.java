import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Node{
	int data;
	Node left;
	Node right;
	public Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
}
public class BinarySearchTree {

	public Node root;
	public List<Integer> integers = new ArrayList<>();
	
	public BinarySearchTree(){
		this.root = null;
	}
	public int addTree(Node root)
	{
		if(root == null)
			return 0;
		return root.data + addTree(root.left)+addTree(root.right);
	}
	public void insert(int data)
	{
		Node newNode = new Node(data);
		if(root == null)
		{
			root = newNode;
			return;
		}
		Node current = root;
		Node parent = null;
		while(true)
		{
			parent = current;
			if(data < current.data)
			{
				current = current.left;
				if(current == null)
				{
					parent.left = newNode;
					return;
				}
			}
			else{
				current = current.right;
				if(current == null)
				{
					parent.right = newNode;
					return;
				}
			}
		}
	}
	
	public void display(Node root){
		if(root!=null){
			display(root.left);
			System.out.print(" " + root.data);
			display(root.right);
		}
	}
	
    void printPreorder(Node node)
    {
        if (node == null)
            return;
 
        System.out.print(node.data + " ");
 
        printPreorder(node.left);
 
        printPreorder(node.right);
    }

	void printPostorder(Node node)
    {
        if (node == null)
            return;
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.data + " ");
    }
    void printInorder(Node node)
    {
        if (node == null)
            return;
        printInorder(node.left);
        integers.add(node.data);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }
    boolean findIterative(int data)
    {
    	if(root == null)
    		return false;
    	Node current = root;
    	while(current != null)
    	{
    		if(current.data == data)
    			return true;
    		else if(current.data > data )
    		{
    			current = current.left;
    		}
    		else
    			current = current.right;
    	}
    	return false;
    	
    }
    
    public int height(Node root)
    {
    	if(root == null)
    		return -1;
    	return 1+ ((height(root.left) > height(root.right)) ? height(root.left) : height(root.right));
    }
    Node getSuccessor(Node deleteNode)
    {
    	Node current = deleteNode.right;
    	Node successor = null;
    	Node successorParent = null;
    	while(current != null)
    	{
    		successorParent = successor;
    		successor = current;
    		current = current.left;
    		
    	}
    	if(successor != deleteNode.right)
    	{
    		successorParent.left = successor.right;
    		successor.right = deleteNode.right;
    	}
    	return successor;
    }
    public boolean delete(int id){
		Node parent = root;
		Node current = root;
		boolean isLeftChild = false;
		while(current.data!=id){
			parent = current;
			if(current.data>id){
				isLeftChild = true;
				current = current.left;
			}else{
				isLeftChild = false;
				current = current.right;
			}
			if(current ==null){
				return false;
			}
		}
		if(current.left==null && current.right==null){
			if(current==root){
				root = null;
			}
			if(isLeftChild ==true){
				parent.left = null;
			}else{
				parent.right = null;
			}
		}
		//Case 2 : if node to be deleted has only one child
		else if(current.right==null){
			if(current==root){
				root = current.left;
			}else if(isLeftChild){
				parent.left = current.left;
			}else{
				parent.right = current.left;
			}
		}
		else if(current.left==null){
			if(current==root){
				root = current.right;
			}else if(isLeftChild){
				parent.left = current.right;
			}else{
				parent.right = current.right;
			}
		}else if(current.left!=null && current.right!=null){
			
			//now we have found the minimum element in the right sub tree
			Node successor	 = getSuccessor(current);
			if(current==root){
				root = successor;
			}else if(isLeftChild){
				parent.left = successor;
			}else{
				parent.right = successor;
			}			
			successor.left = current.left;
		}		
		return true;		
	}
    Node mirror(Node node)
    {
    	if(node == null)
    		return node;
    	
    	Node left = mirror(node.left);
    	Node right = mirror(node.right);
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
    
    
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		BinarySearchTree b = new BinarySearchTree();
		b.insert(3);b.insert(8);
		b.insert(1);b.insert(4);b.insert(6);b.insert(2);b.insert(10);b.insert(9);
		b.insert(20);b.insert(25);b.insert(15);b.insert(16);
		System.out.println("Original Tree : ");
		b.display(b.root);
		System.out.println();
		b.printInorder(b.root);
		System.out.println();
		b.printPostorder(b.root);
		System.out.println();
		b.printPreorder(b.root);
		System.out.println(b.findIterative(252));
		System.out.println();
		//b.printInorder(b.getSuccessor(b.root));
		System.out.println();
	
		
		BinarySearchTree tree = new BinarySearchTree();
		System.out.println("before mirror");
		b.printInorder(b.root);
		tree.root = b.mirror(b.root);
		System.out.println("after mirror");
		b.printInorder(b.root);
		System.out.println();
		tree.printInorder(tree.root);
		
		System.out.println(checkMirror(b.root, tree.root));

		System.out.println("Inorder" +b.integers);
		for(int i=0;i<b.integers.size()-1;i++)
		{
			if(b.integers.get(i)>b.integers.get(i+1) )
			{	System.out.println("NOT BST");
			break;
			}
		}
		System.out.println("BST");
		tree.printInorder(tree.root);
		System.out.println();
		System.out.println(tree.addTree(tree.root));
		System.out.println(tree.height(tree.root));
	}
	

}
