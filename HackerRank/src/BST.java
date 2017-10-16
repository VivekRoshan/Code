import java.util.LinkedList;

class BSTNode
{
	BSTNode left,right;
	int data;
	BSTNode(int data)
	{
		this.data=data;
	}
}
public class BST {
	public static LinkedList<Integer> counter = new LinkedList<>();
	
	public static LinkedList<Integer> popout(BSTNode root)
	{
		if(root == null)
		{
			return new LinkedList<Integer>();
		}
		if(root.left != null)
		{
			popout(root.left);
		}
		counter.add(root.data);
		if(root.right != null)
		{
			popout(root.right);
		}
		
		if(root.left == null && root.right==null)
			return counter;
		return counter;
	}
	public static void insert(BSTNode root, int value)
	{
		if(root == null)
		{
			root = new BSTNode(value);
		}
		if(root.data >= value )
		{
			if(root.left == null)
			{
				root.left = new BSTNode(value);
			}
			else
			{
				insert(root.left, value);
			}
		}
		else
		{
			if(root.right == null)
			{
				root.right = new BSTNode(value);
			}
			else{
				insert(root.right,value);
			}
		}
	}
	public static boolean contains(BSTNode root,int value)
	{
		if(root == null)
		{
			return false;
		}
		if(root.data == value)
		{
			return true;
		}
		else if(root.data > value)
		{
			if(root.left == null)
			{
				return false;
			}
			else
			{
				return contains(root.left,value);
			}
		}
		else{
			if(root.right == null)
			{
				return false;
			}
			else
			{
				return contains(root.right,value);
			}
		}
	}
	public static void printInorder(BSTNode root)
	{
		if(root == null)
		{
			System.out.println("No tree");
		}
		if(root.left != null)
		{
			printInorder(root.left);
		}
		System.out.println(root.data);
		if(root.right != null)
		{
			printInorder(root.right);
		}
	}
	
	public static int findMax(BSTNode root)
	{
		if(root == null)
		{
			return 0;
		}
		BSTNode temp = root;
		while(temp.right != null)
		{
			temp= temp.right;
		}
		return temp.data;
	}
	public static BSTNode mirror(BSTNode root)
	{
		if(root == null)
			return root;
		BSTNode leftMirror = mirror(root.left);
		BSTNode rightMirror = mirror(root.right);
		root.right = leftMirror;
		root.left = rightMirror;
		
		return root;
		
	}
	public static void main(String[] args) {
		BSTNode bst = new BSTNode(40);
		insert(bst, 25);
		insert(bst, 78);
		insert(bst, 10);
		insert(bst, 32);
		insert(bst, 50);
		insert(bst, 93);
		insert(bst, 3);
		insert(bst, 17);
		insert(bst, 30);
		insert(bst, 38);
		
		printInorder(bst);
		LinkedList<Integer> integers = popout(bst);
		for(Integer integer:integers)
		{
			System.out.print(integer+":");
		}
		System.out.println();
		
		System.out.println("Max: "+findMax(bst));
		BSTNode mirror = mirror(bst);
		LinkedList<Integer> integers2 = popout(mirror);
		System.out.println(integers2);
		
		
		
		
	}
	}

	

