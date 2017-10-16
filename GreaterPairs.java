package bloomberg.practice;

import java.util.Stack;

public class GreaterPairs {

	public static void main(String[] args) {

		int[] arr = new int[]{1,2,5,2,6};
		Stack<Integer> stack = new Stack<>();
		stack.push(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			int next = arr[i];
			if(!stack.isEmpty())
			{
				int element = stack.pop();
				while(next > element)
				{
					System.out.println(element+"-----"+next);
					if(stack.isEmpty())
						break;
					element = stack.pop();
				}
				if(element > next)
				{
					stack.push(element);
				}
				stack.push(next);
			}
		}
	}

}
