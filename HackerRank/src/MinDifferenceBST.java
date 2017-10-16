import java.util.LinkedList;

class TreeNode
{
	TreeNode left,right;
	int data;
	TreeNode(int data)
	{
		this.data=data;
	}
}
public class MinDifferenceBST {
	public static LinkedList<Integer> counter = new LinkedList<>();
	
	public static LinkedList<Integer> popout(TreeNode root)
	{
		if(root == null)
		{
			return new LinkedList<Integer>();
		}
		if(root.left != null)
		{
			popout(root.left);
		}
		if((root.data+"") != null)
			counter.add(root.data);
		if(root.right != null)
		{
			popout(root.right);
		}
		
		if(root.left == null && root.right==null)
			return counter;
		return counter;
	}
	public static void insert(TreeNode root, int value)
	{
		if(root == null)
		{
			root = new TreeNode(value);
		}
		if(root.data >= value )
		{
			if(root.left == null)
			{
				root.left = new TreeNode(value);
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
				root.right = new TreeNode(value);
			}
			else{
				insert(root.right,value);
			}
		}
	}
	
public static int getMinimumDifference(TreeNode root) {
	LinkedList<Integer> integers2 = popout(root);
	int min = Integer.MAX_VALUE;
	int[] arr = new int[integers2.size()];
	int i=0;
	for (Integer integer : integers2) {
		arr[i] = integer;
		i++;
	}
	for(int j =0; j< arr.length-1;j++ )
	{
		if(Math.abs(arr[j]-arr[j+1]) < min)
		{
			min = Math.abs(arr[j]-arr[j+1]);
		}
	}
     
	return min;
    }
	public static void main(String[] args) {
		TreeNode bst = new TreeNode(40);
		insert(bst, 1);
		insert(bst, 78);
		insert(bst, 10);
		insert(bst, 32);
		insert(bst, 50);
		insert(bst, 93);
		insert(bst, 3);
		insert(bst, 17);
		insert(bst, 30);
		insert(bst, 38);
		
		System.out.println(getMinimumDifference(bst));
		System.out.println(popout(bst));
	}
	
}
