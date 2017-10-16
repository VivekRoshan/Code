
public class SlidingWindow2 {
    public static int maxNumber(int[] nums, int initial,int k)
    {
    	int max = nums[initial];
    	for(int i=initial+1;i<k+initial;i++)
    		if(max < nums[i])
    			max = nums[i];
    	{
    		return  max;
    	}
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
    	int window = 0;
    	if(nums.length ==0  || k==0)
    	{
    		return nums;
    	}
    	
    	int[] arr = new int[nums.length-k+1];
    	while(window+k <= nums.length)
    	{
    		arr[window] = maxNumber(nums, window, k);
    		window++;
    	}
    		
    	return arr;
    	
    }
    public static void main(String[] args) {
    	 int arr[] = {1,2,3,4,5,6,7,1,2,3,5};
         int A[] = maxSlidingWindow(arr,3);
         for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
			
		}
  
	}
}