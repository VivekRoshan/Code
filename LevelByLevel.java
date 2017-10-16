package bloomberg.practice;

import java.util.LinkedList;
import java.util.Queue;

public class LevelByLevel {

	static void printLevelByLevel(Node root)
	{
		if(root == null)
			return;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(true)
		{
			int nodeCount = q.size();
			if (nodeCount == 0)
				break;
			while(nodeCount > 0)
			{
				Node node = q.peek();
				q.remove();
				System.out.print(node.data+" ");
				if(node.left != null)
					q.add(node.left);
				if(node.right != null)
					q.add(node.right);
				nodeCount--;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        printLevelByLevel(root);
	}

}
