package bloomberg.practice;

import java.util.HashMap;
import java.util.Map;

class Node 
{
    int data;
    Node left, right;
  
    Node(int item) 
    {
        data = item;
        left = right = null;
    }
}
public class HorizontalLevelBinaryTree {
	
	Node root;
	static int sum;
	static Map<Integer, Integer> map = new HashMap<Integer,Integer>();
	void horizontalSum(Node root,int rootHD)
	{
		if(root == null)
			return;
		horizontalSum(root.left, rootHD+1);
		map.put(rootHD, (map.containsKey(rootHD) ? map.get(rootHD)+root.data : root.data ));
		horizontalSum(root.right, rootHD+1);
	}
	void printKDistant(Node node, int k) 
    {
		if(node == null)
			return;
		if(k == 0)
		{
			sum += node.data; 
			System.out.println(node.data+" ");
			return;
		}
		else{
			printKDistant(node.left, k-1);
			printKDistant(node.right, k-1);
		}
    }
	void levelOfNode(Node root,int data)
	{
		if(root == null)
			return;
		levelOfGivenNode(root,0,data);
		}
	public void levelOfGivenNode(Node root, int k,int data)
	{
		if(root == null)
			return;
		if(root.data == data)
		{
			System.out.println(k);
			return;
		}
		
		levelOfGivenNode(root.left, k+1, data);
		levelOfGivenNode(root.right, k+1, data);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HorizontalLevelBinaryTree tree = new HorizontalLevelBinaryTree();
        
        /* Constructed binary tree is
                1
              /   \
             2     3
            /  \   /
           4    5 8 
        */
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(8);
  
        tree.printKDistant(tree.root, 2);
        System.out.println(HorizontalLevelBinaryTree.sum);
        
        tree.horizontalSum(tree.root, 0);
        System.out.println("--------------");
        for(Integer i:HorizontalLevelBinaryTree.map.keySet())
        {
        	System.out.println(i+" "+HorizontalLevelBinaryTree.map.get(i));
        }
        
        System.out.println("-----");
        tree.levelOfNode(tree.root, 9);

	}

}
