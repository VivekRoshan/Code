import java.util.LinkedList;
import java.util.Queue;

public class RotateFunction {

	public static int rotateFunction(int[] arr)
	{
		int window=arr.length;
		Queue<Integer> queue = new LinkedList<>();
		for(int i=0;i<arr.length;i++)
		{
			queue.add(arr[i]);
		}
		Queue<Integer> IterativeQueue = new LinkedList<>();
		for(int i=0;i<arr.length;i++)
		{
			IterativeQueue.addAll(queue);
		}
		queue.clear();
		int[] sum=new int[window];
		int counter = 0;
		int i=0;
		while(counter< window )
		{
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		return 0;
	}
	public static void main(String[] args) {
		int arr[] = {4,3,2,6};
		
		
		
		
	}

}
