package bloomberg.practice;

import java.util.Stack;

public class MinStack extends Stack<Integer> {

	Stack<Integer> min = new Stack<>();
	
	@Override
	public Integer push(Integer item) {
		if(super.isEmpty())
		{
			min.push(item);
			return super.push(item);
		}
		else{
			int i = min.peek();
			if(item < i)
			{
				min.push(item);
			}
			else{
				min.push(i);
			}
			return super.push(item);
			
		}
	}
	
	@Override
	public synchronized Integer pop() {
		if(!super.isEmpty()){
			min.pop();
		return super.pop();}
		else
			return Integer.MIN_VALUE;
			
	}
	
	public Integer getMin()
	{
		if(!min.isEmpty())
			return min.peek();
		else
			return Integer.MIN_VALUE;
	}
	
}

