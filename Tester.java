package bloomberg.practice;

public class Tester {

	public static void main(String[] args) {

		MinStack minStack = new MinStack();
		minStack.push(3);
		System.out.println(minStack.getMin());
		minStack.push(5);
		System.out.println(minStack.getMin());
		minStack.push(2);
		System.out.println(minStack.getMin());
		minStack.push(6);
		System.out.println(minStack.getMin());
		minStack.push(1);
		System.out.println(minStack.getMin());
		minStack.push(-1);
		System.out.println(minStack.getMin());
		minStack.pop();
		System.out.println(minStack.getMin());
		minStack.pop();
		System.out.println(minStack.getMin());
		minStack.pop();
		System.out.println(minStack.getMin());
		minStack.pop();
		System.out.println(minStack.getMin());
		minStack.pop();
		System.out.println(minStack.getMin());
		minStack.pop();
		System.out.println(minStack.getMin());
		System.out.println(minStack.pop());
		
	}

}
