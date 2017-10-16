package bloomberg.practice;

import java.util.HashMap;
import java.util.Map;

public class VerticalSum {
	Node root;
	static Map<Integer, Integer> map = new HashMap<Integer,Integer>();
	public void verticalSum(Node root,int rootHD)
	{
		if(root == null)
			return;
		verticalSum(root.left, rootHD-1);
		
		map.put(rootHD, (map.containsKey(rootHD) ? map.get(rootHD)+root.data : root.data ));
		/*int prevSum = (map.get(rootHD) == null) ? 0 : map.get(rootHD);
        map.put(rootHD, prevSum + root.data);
		*/
		verticalSum(root.right, rootHD+1);
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VerticalSum tree = new VerticalSum();
        
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
  
        //tree.vertical(tree.root, 2);
        tree.verticalSum(tree.root, 0);
        for(Integer i:VerticalSum.map.keySet())
        {
        	System.out.println(i+" "+VerticalSum.map.get(i));
        }

	}

}
