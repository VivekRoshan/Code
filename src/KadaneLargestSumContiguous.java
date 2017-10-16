
public class KadaneLargestSumContiguous {
	public static void main (String[] args)
    {
        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3,4};
        System.out.println("Maximum contiguous sum is " +
                                       maxSubArraySum(a));
    }
 
    static int maxSubArraySum(int a[])
    {
    	int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
    	for(int i=0;i<a.length;i++)
    	{
    		max_ending_here += a[i];
    		if((max_ending_here) < 0 )
    			max_ending_here = 0;
    		if(max_so_far < max_ending_here ){
    			System.out.println(i);
    			max_so_far = max_ending_here;}
    	}
    	return max_so_far;
    	
    }
}
