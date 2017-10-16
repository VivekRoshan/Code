package practice;

import java.util.LinkedList;
import java.util.Queue;

class Node{
	int data;
	Node left;
	Node right;
	Node(int data)
	{
		this.data = data; 
		left = right = null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	
}
public class BinaryTreesPractice {

	Node rootNode;
	public Node addNodes(Node rootNode, int data)
	{
		Queue<Node> q = new LinkedList<Node>();
		q.add(rootNode);
		while(!q.isEmpty())
		{
			Node v = q.poll();
			if(v.left != null && v.right != null)
			{
				q.add(v.left);
				q.add(v.right);
			}
			else{
				if(v.left == null)
					v.left = new Node(data);
				else
					v.right = new Node(data);
				break;
			}
		}
		return rootNode;
		
	}
	public void printOrder(Node rootNode)
	{
		Queue<Node> q = new LinkedList<Node>();
		Node newLine = new Node(Integer.MIN_VALUE);
		q.add(rootNode);
		q.add(newLine);
		while(!q.isEmpty())
		{
			Node v = q.poll();
			if(v.data == newLine.data)
			{
				System.out.println();
				if(!q.isEmpty())
					q.add(newLine);
			}
			else{
				System.out.print(v.getData()+" ");
				if(v.left != null)
					q.add(v.left);
				if(v.right != null)
					q.add(v.right);
					
			}
		}
	}
	public void printInorder(Node rootNode)
	{
		printInorder(rootNode.left);
		System.out.print(rootNode.data+ " ");
		printInorder(rootNode.right);
		
	}
	public static void main(String[] args) {
		Node rootNode = new Node(1);
		BinaryTreesPractice practice = new BinaryTreesPractice();
		practice.rootNode = rootNode;
		practice.printOrder(rootNode);
		practice.printInorder(practice.rootNode);
		}

}
