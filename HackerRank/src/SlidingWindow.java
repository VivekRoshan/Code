import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class SlidingWindow {
    public static int maxNumber(Queue queue)
    {
        int max = (int)queue.poll();
        if(!queue.isEmpty()){
        for (Object object : queue) {
			Integer element = (Integer)object;
			if(element>max)
			{
				max= element;
			}
		}}
        return max;
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Queue<Integer> queueB = new LinkedList<Integer>();
        
        int j = 0,i=0;
        while(j+3 <= nums.length)
        {
        	for(i=j;(i<j+3 && j+3 <= nums.length);i++)
        	{
        		queue.add(nums[i]);
        	}
        	queueB.add(maxNumber(queue));
        	j=j+1;
        }
        int[] answer= new int[queueB.size()];
        i=0;
        for (Integer integer : queueB) {
			answer[i] = integer;
			i++;
		}
        return answer;
    }
    public static void main(String[] args) {
    	 int arr[] = {1,2,3,4,5,6,7,8};
         int A[] = maxSlidingWindow(arr,3);
         for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
			
		}
  
	}
}