package bloomberg.practice;

public class MaxDiffTraditional {

	static int MaxDiff(int[] a){
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if(a[i] > max)
				max = a[i];
			if(a[i] < min)
				min = a[i];
		}
		return max -min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(MaxDiff(new int[]{-1,2,3,4,5,6,7}));
	}

}
