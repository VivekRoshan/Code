package practice;

public class SortArrayZeroesOnes {

	public static void main(String[] args) {

		int arr[] = new int[]{0,1,0,0,0,0,1,1,1,1,1,1,1,0,1,0,1,1,0,1,1,1,0,0,0,1,0,0,1,1,1,0,0,0,1,0,0,0,1,1,1,0,1,1};
		int start = 0;
		int end = arr.length-1;
		while(start<end)
		{
			while(arr[start] == 0 && start < end)
			{
				start++;
			}
			while(arr[end] == 1 && start < end)
			{
				end--;
			}
			if(start < end)
			{
				arr[start] = 0;
				arr[end] = 1;
				start++;
				end--;
			}
		}
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
