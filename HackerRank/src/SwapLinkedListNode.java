

class LinkedListNode
{
	int  data;
	LinkedListNode next;
	public LinkedListNode(int data) {
		this.data = data;
	}
}

public class SwapLinkedListNode {

	public static LinkedListNode swapNodes(LinkedListNode head,int value1,int value2)
	{
		LinkedListNode dummy = new LinkedListNode(0);
		dummy.next = head;
		LinkedListNode cur = dummy;
		LinkedListNode node1Prev = null, node2Prev = null;
		int counter1 = 0, counter2 = 0, counter=0;
		while(cur.next != null)
		{
			if(cur.next.data == value1)
			{
				node1Prev = cur;
				counter1 = counter;
			}
			if(cur.next.data == value2)
			{
				node2Prev = cur; 
				counter2 = counter;
			}
			cur = cur.next;
			counter++;
		}
		
		if(counter1>counter2)
		{
			LinkedListNode temp = node1Prev;
			node1Prev = node2Prev;
			node2Prev = temp;
		}
		
		
		if(node1Prev == null || node2Prev == null)
		{
			return head;
		}
		
		
		LinkedListNode node1 = node1Prev.next;
		LinkedListNode node2 = node2Prev.next;
		LinkedListNode node2Next = node2.next;
		
		if(node1Prev.next == node2Prev)
		{
			node1Prev.next = node2;
			node1.next = node2Next;
			node2.next = node2Prev;
		}
		else
		{
			/*node1Prev.next = node2;
            node2.next = node1.next;
            node2Prev.next = node1;
            node1.next = node2Next;*/
			node1Prev.next = node2;
			node1.next = node2Next;
			node2.next = node2Prev;
			node2Prev.next = node1;
			
			
		}
		
		return dummy.next;
		
	}
	
	public static void main(String[] args) {
		LinkedListNode node = new LinkedListNode(1);
		int counter = 2; 
		LinkedListNode temp = node;
		while(counter<7)
		{
			if(temp.next == null)
			{
				LinkedListNode nextNode = new LinkedListNode(counter);
				temp.next = nextNode;
				temp = temp.next;
				counter++;	
			}
			
		}
		LinkedListNode print = node;
		while(print.next != null)
		{
			System.out.println(print.data);
			print = print.next;
		}
		System.out.println(" ");
		LinkedListNode dummy = swapNodes(node, 2, 3);
		while(dummy.next != null)
		{
			System.out.println(dummy.data);
			dummy = dummy.next;
		}
	}

}
