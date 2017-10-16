import java.util.LinkedList;
import java.util.Stack;

class Node {
        int data;
        Node left;
        Node right;
        }
class CheckBST
{
	public static LinkedList<Integer> counter = new LinkedList<>();
	public static LinkedList<Integer> popout(Node root)
	{
		if(root.left != null)
		{
			popout(root.left);
		}
		counter.add(root.data) ;
		if(root.right != null)
		{
			popout(root.right);
		}
			
		if(root.left == null && root.right == null)
			return counter;
		return counter;
		
	}
	boolean checkBST(Node root) {
		LinkedList<Integer> counter = new LinkedList<>();
		counter = popout(root);
		int flagCounter = 0;
		int min = 0;
		for (Integer integer : counter) {
			if(min<integer)
			{
				flagCounter++;
				min=integer;
			}
		}
		if(flagCounter==counter.size())
			return true;
		else
			return false;
    }
}