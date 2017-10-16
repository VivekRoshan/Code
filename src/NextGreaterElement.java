import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NextGreaterElement {

	static void printNGE(int[] arr,int n)
	{
		int next = 0,element =0;
		Stack<Integer> integers = new Stack<>();
		integers.add(arr[0]);
		for(int i=1;i<arr.length;i++)
		{
			next = arr[i];
			if(!integers.isEmpty())
			{
				element = integers.pop();
				while(element < next)
				{
					System.out.println(element+"----"+next);
					if(integers.isEmpty())
						break;
					element = integers.pop();
				}
				
				if(element > next)
					integers.push(element);
				integers.push(next);
			}
		}
		while(!integers.isEmpty())
		{
			System.out.println(integers.pop()+"----- -1");
		}
		

	}
	public static void main(String[] args) {

		int arr[] = {13,7,6,12 };
        int n = arr.length;
        printNGE(arr, n);
	}

}
