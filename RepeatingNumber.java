package bloomberg.practice;

public class RepeatingNumber {

	public static void main(String[] args) {
		//int[] arr = {1,4,5,3,2,7,6,9,8,1};
		int arr[] = new int[]{2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
		int res = 0;
		for (int i = 0; i < arr.length; i++) {
			res = res ^ arr[i];
		}
		System.out.println(res);
	}
}
