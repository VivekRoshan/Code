package bloomberg.practice;

public class WaysToAddUp {

	int ways_of_sum_up(int n)
	{
	    if (n == 0)
	        return 1;
	    if (n < 0)
	        return 0;
	    int ans = ways_of_sum_up (n-1) + ways_of_sum_up (n-2);
	    return ans;
	}
	public static void main(String[] args) {
		WaysToAddUp up = new WaysToAddUp();
		System.out.println(up.ways_of_sum_up(5));

	}

}
