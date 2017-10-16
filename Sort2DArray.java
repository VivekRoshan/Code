package bloomberg.practice;

import java.util.Arrays;
import java.util.Comparator;

public class Sort2DArray {

	public static int[][] sorter(int[][] arr)
	{
		for(int i=0;i<arr.length;i++)
			for(int j = i+1;j<arr.length;j++)
			{
				if(arr[i][0] > arr[j][1])
				{
					int[] temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		return arr;
	}
	
	public static void main(String[] args) {
		int arr[][] = {{1,2,3,4},
				       {2,1,4,5},
				       {3,5,4,6},
				       {0,4,2,5}};
		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				
				return Integer.valueOf(o1[0]).compareTo(Integer.valueOf(o2[0])); 
			}
		});
		

		for (int[] is : arr) {
			for (int i = 0; i < is.length; i++) {
				System.out.print(is[i]+" ");
			}
			System.out.println();
		}
		System.out.println();
		int[][] sorter = sorter(arr);
		for (int[] is : sorter) {
			for (int i = 0; i < is.length; i++) {
				System.out.print(is[i]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
