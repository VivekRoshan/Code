package bloomberg.practice;

import java.util.Arrays;

public class RemoveDuplicates {

	public static int[] removeduplicates(int[] arr)
	{
		int j= 0;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i] != arr[i+1])
			{
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[arr.length-1];
		return Arrays.copyOf(arr, j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = removeduplicates(new int[]{1,2,3,4,4,5,5,5,5,6,6,8,8});
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
