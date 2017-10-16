package exam;

class Node{
	String str;
	Node next = null;
	public Node(String s,Node n) {
		str = s;
		next = n;
	}
	void print(){
		System.out.println(str);
	}
	public void printall(String sep){
		for(Node p = this;p!= null;p=p.next){
			p.print();
			if(sep.length()!= 0 && p.next!= null){
				System.out.println(sep);
			}
		}
		System.out.println("");
	}
}
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "1st";
		final Node node1 = new Node(s1, null);
		String s2= "2nd";
		Node node2 = new Node(s2, node1);
		String s3 = "3rd";
		Node node3 = new Node(s3, node2);
		node3.printall("/");
	}

}
