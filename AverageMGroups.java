package bloomberg.practice;

import java.util.Collections;
import java.util.PriorityQueue;

public class AverageMGroups {

	public static void SlidingMaximum(int[] arr,int m)
	{
		int j=0;
		int max = Integer.MIN_VALUE;
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
		for (int i = 0; i < arr.length; i++) {
			j++;
			queue.add(arr[i]);
			if(arr[i] > max)
			{
				max = arr[i];
			}
			if(j%m == 0)
			{
				System.out.println(max);
				j--;
				if(max == arr[i-m+1])
				{
					queue.poll();
					max = queue.peek();
				}
				
			}
		}
	}
	public static void slidingMaxMin(int[] arr,int m)
	{
		int j =0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		PriorityQueue<Integer> queueA = new PriorityQueue<>();
		PriorityQueue<Integer> queueB = new PriorityQueue<>(Collections.reverseOrder());
		for (int i = 0; i < arr.length; i++) {
			j++;
			queueA.add(arr[i]);
			queueB.add(arr[i]);
			if(arr[i] > max)
			{
				max = arr[i];
			}
			if(arr[i] < min)
			{
				min = arr[i];
			}
			if(j%m == 0)
			{
				System.out.println(max-min);
				j--;
				if(max == arr[i-m+1])
				{
					queueB.poll();
					max = queueB.peek();
				}
				if(min == arr[i-m+1])
				{
					queueA.poll();
					min = queueA.peek();
				}
			}
		}
		
	}
	public static void main(String[] args) {
		//int arr[] = {3,2,1,4,1,2,5,6};
		int arr[] =  {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
		int m = 4;
		int j = 0;
		int sum = 0;
		for (int i=0;i<arr.length;i++) {
			sum+=arr[i];
			j++;
			if(j % m ==0 && j != 0)
			{
				System.out.println(sum/m);
				sum -= arr[i-m+1];
				j--;
			}
		}
		String str1 = "Hello";
		String str2 = "llo";
		str1 = str1.replace(str2, "");
		System.out.println(str1);
		
		System.out.println("-----------------");
		SlidingMaximum(arr, m);
		System.out.println("----------------");
		slidingMaxMin(arr, m);

	}

}
