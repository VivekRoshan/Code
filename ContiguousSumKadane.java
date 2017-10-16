package bloomberg.practice;

public class ContiguousSumKadane {
	static int contiguousSumKadane(int[] arr)
	{
		int max_so_far = 0;
		int max_ending_here = 0;
		for (int i = 0; i < arr.length; i++) {
			max_so_far += arr[i];
			if(max_ending_here < max_so_far)
				max_ending_here = max_so_far;
			if(max_so_far<0)
				max_so_far = 0;
		}
		return max_ending_here;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {-2, -5, 6, -2, -3, 1, 5, -6};
		System.out.println(contiguousSumKadane(arr));
	}

}
