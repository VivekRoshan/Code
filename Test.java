package bloomberg.practice;

import java.util.Arrays;

public class Test {

	public static int[] sortOnesZeroes(int[] arr)
	{
		int start = 0;
		int end = arr.length-1;
		while(start<end)
		{
			while(arr[start] == 0)
			{
				start++;
			}
			while(arr[end] == 1)
			{
				end--;
			}
			if(start<end)
			{
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr =  sortOnesZeroes(new int[]{0,1,0,0,0,0,1,1,1,1,1,1,1,0,1,0,1,1,0,1,1,1,0,0,0,1,0,0,1,1,1,0,0,0,1,0,0,0,1,1,1,0,1,0} );
		System.out.println(Arrays.toString(arr));
	}

}
