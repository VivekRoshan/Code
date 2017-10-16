package contest32;
public class Solution {
		
	public static Node Insert(Node head, int data)
	{
		Node temp = head;
	    Node addition = new Node();
	    addition.data = data;
	    if(temp != null)
	    {
	        while(temp.next != null)
	        {
	            temp = temp.next;
	        }
	    }
	    temp.next = addition;
	    addition.next = null;
	    return head;
	}
	public static void Print(Node head) {
	    if(head != null)
	    {

	    	while(head != null)
	        {
	            System.out.println(head.data);
	            head = head.next; 
	        }
	    }  
	}
	public static Node HeadInsert(Node head,int x) {
	    
	    Node node = new Node();
	    node.data = x;
	    
	    Node temp = head;
	    node.next = temp;
	    
	    return node;
	    
	    
	}

	static Node InsertNth(Node head, int data, int position) {
		int i=0;
		int j=1;
		Node temp = head;
		while(temp != null)
		{
			i++;
			temp = temp.next;
		}
		Node insert = new Node();
		insert.data = data;
		if(position > i || position< 0 )
		{
			return head;
		}
		else if(head == null)
		{
			Node node = new Node();
			node.data = data;
			node.next = null;
			return node;
					
		}
		else{
			if(position == 0)
			{
				Node node = new Node();
			    node.data = data;
			    Node temp1 = head;
			    node.next = temp1;
			    return node;
			}
			else{
				temp = head;
				while(j < position)
				{
					temp = temp.next;
					j++;
				}
				
				Node temp1 = temp.next;
				insert.next = temp1;
				temp.next = insert;
				 
				
			}
			return head;
			
			
		}
	
	}
	
	static Node Delete(Node head, int position) {
		int j=0;
		int len = 0;
		Node temp = head;
		while(temp!= null)
		{
			len++;
			temp = temp.next;
		}
		temp=head;
		if(len==0 || head== null || position>len)
		{
			return head;
		}
		else if(len == 1 && position == 0)
		{
			return null;
		}
		else if(position == 0)
		{
			Node temporary = temp.next;
			return temporary;
		}
		else if(len == position)
		{
			temp = head;
			while(j<position-2)
			{
				temp = temp.next;
				j++;
			}
			Node temp1 = temp.next;
			
			temp.next = null;
			//temp1.next = null;
			
			return head;
			
		}
		else{
			temp = head;
			while(j<position-1)
			{
				temp = temp.next;
				j++;
			}
			Node temp1 = temp.next;
			Node temp2 = temp1.next;
			temp.next = temp2;
			//temp1.next = null;
			
			return head;
		}
	}
	static void ReversePrint(Node head) {
		 Node temp = head;
		 int i=0;
		 int len = 0;
		 while(temp!= null)
		 {
				len++;
				temp = temp.next;
		 }
		 temp=head;
		 Integer[] arr= new Integer[len];
		 while(temp!= null)
		 {
				arr[i] = temp.data;
				temp = temp.next;
				i++;
		 }
		 for(i = 0; i < arr.length / 2; i++)
		 {
		     int temp1 = arr[i];
		     arr[i] = arr[arr.length - i - 1];
		     arr[arr.length - i - 1] = temp1;
		 }
		 for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
		}
	Node Reverse(Node head) {

		if(head == null || head.next == null)
		{
			return head;
		}
		else{
			Node second = head.next;
			head.next = null;
			
			Node reverse = Reverse(second);
			second.next = head;
			return reverse;
		}
	}
	static void ReverseRec(Node head)
	{
		if(head == null)
		{
			;
		}
		else{
			ReverseRec(head.next);
			System.out.println(head.data);
		}
	}
	static int len(Node head)
	{
		Node temp = head;
		int len = 0;
		 while(temp!= null)
		 {
				len++;
				temp = temp.next;
		 }
		 return len;
	}
	int CompareLists(Node headA, Node headB) {
	    // This is a "method-only" submission. 
	    // You only need to complete this method 
		int len1 = len(headA);
		int len2 = len(headB);
		if(len1 != len2)
		{
			return 0;
		}
		else{
			int i=0;
			Node tempA = headA;
			Node tempB = headB;
			while(i<len1)
			{
				if(tempA.data != tempB.data)
					return 0;
				tempA = tempA.next;
				tempB = tempB.next;
				i++;
				
			}
			return 1;
		}
	}
	Node mergeLists(Node headA, Node headB) {
	     // This is a "method-only" submission. 
	     // You only need to complete this method 
		Node node = new Node();
		Node temp = node;
		while(headA != null || headB != null)
		{
			if(headA != null && headB != null)
			{
				if(headA.data < headB.data)
				{
					temp.next = headA;
					headA = headA.next;
				}
				else
				{
					temp.next = headB;
					headB = headB.next;
				}
				temp = temp.next;
			}
			else if(headA == null)
			{
				temp.next = headB;
				break;
			}
			else if(headB == null)
			{
				temp.next = headA;
				break;
			}
		}
		return node.next;
	}
	static int GetNode(Node head,int n) {
		Node first = head;
		Node second = head;
		int index = 0;
		while(second != null)
		{
			second = second.next;
			if(index > n)
			{
				first = first.next;
			}
			index++;
			
		}
		return first.data;
	}
	static Node RemoveDuplicates(Node head) {
		  // This is a "method-only" submission. 
		  // You only need to complete this method. 
		Node first = head;
		Node second = head.next;
		Node result = new Node();
		Node iter = result;
		while(first != null && second != null)
		{
			while(first.data == second.data )
				second = second.next;
			Node temp =  new Node();
			temp.data = first.data;
			iter.next = temp;
			first = second;
			second = second.next;
			iter = iter.next;
		}
		if(first != null)
		{
			Node temp =  new Node();
			temp.data = first.data;
			iter.next = temp;
		}
		head = result.next;
		return head;
		
		}


	public static void main(String[] args) {
		Node head = new Node();
		/*head.data = 1;
		
		head  = Insert(head, 2);
		Print(head);
		System.out.println();
		head = Insert(head, 3);
		Print(head);
		System.out.println();
		head = HeadInsert(head, 0);
		Print(head);
		System.out.println();
		
		head = InsertNth(head, 10, 3);
		Print(head);

		System.out.println();
		head = InsertNth(head, 10, 0);
		Print(head);
		
		System.out.println();
		head = InsertNth(head, 10, 7);
		Print(head);*/
		/*3 0
		5 1
		4 2
		2 3
		10 1*/
		head = InsertNth(head, 3, 0);
		Print(head);
		System.out.println();
		head = InsertNth(head, 5, 1);
		Print(head);
		System.out.println();
		head = InsertNth(head, 4, 2);
		Print(head);
		System.out.println();
		head = InsertNth(head, 2, 3);
		Print(head);
		System.out.println();
		head = InsertNth(head, 10, 1);
		Print(head);
		System.out.println();
		head = Delete(head, 6);
		Print(head);
		System.out.println();
		ReversePrint(head);
		System.out.println("Reverse Rec");
		
		ReverseRec(head);
		System.out.println(); 
		Solution solution = new Solution();
		
		head = solution.Reverse(head);
		head = InsertNth(head, 2, 1);
		head = InsertNth(head, 4, 3);
		head = InsertNth(head, 5, 5);
		head = InsertNth(head, 5, 6);
		
		head = Delete(head, 8);
		head = InsertNth(head, 11, 8);
		Print(head);
		System.out.println();
		
		
		Node headA = new Node();
		headA = InsertNth(headA, 1, 0);
		headA = InsertNth(headA, 3, 1);
		headA = InsertNth(headA, 5, 2);
		headA = InsertNth(headA, 6, 3);
		Print(headA);
		System.out.println();
		Node headB = new Node();
		headB = InsertNth(headB, 2, 0);
		headB = InsertNth(headB, 4, 1);
		headB = InsertNth(headB, 7, 2);
		Print(headB);
		solution.mergeLists(headA, headB);
		System.out.println("Get Node");
		Print(head);
		System.out.println();
		System.out.println(GetNode(head, 0));
		System.out.println("Remove Duplicates");
		Node result = RemoveDuplicates(head);
		Print(result);
		System.out.println("Remove Duplicates 2");
		Node remDup = new Node();
		remDup = InsertNth(remDup, 1, 0);
		remDup = InsertNth(remDup, 1, 1);
		remDup = InsertNth(remDup, 1, 2);
		remDup = InsertNth(remDup, 1, 3);
		remDup = InsertNth(remDup, 1, 4);
		remDup = InsertNth(remDup, 1, 5);
		remDup = InsertNth(remDup, 1, 6);
		Print(RemoveDuplicates(remDup));

		/*remDup = InsertNth(remDup, 2, 0);
		remDup = InsertNth(remDup, 3, 1);
		remDup = InsertNth(remDup, 3, 2);
		remDup = InsertNth(remDup, 4, 3);
		remDup = InsertNth(remDup, 6, 4);
		Print(RemoveDuplicates(remDup));
		*/
	}
	
	
}
