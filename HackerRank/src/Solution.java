import java.util.Stack;

public class Solution {
	public static int NoOfOnes(String nums)
	{
		int counter =0;
		if(nums.length()==1 && nums.charAt(0) == '1')
			return 1;
		for(int i=0;i<nums.length();i++)
		{
			if(nums.charAt(i) == '1')
				counter++;
		}
		return counter;
	}
	public static int NoOfZeros(String nums)
	{
		int counter =0;
		if(nums.length()==1 && nums.charAt(0) == '0')
			return 1;
		for(int i=0;i<nums.length();i++)
		{
			if(nums.charAt(i) == '0')
				counter++;
		}
		return counter;
	}
    public static int findMaxLength(int[] nums) {
    	String temp = new String();
    	temp= "";
    	Stack<Integer> integers = new Stack<>();
    	for(int i=0;i<nums.length;i++)
    	{
    		temp += (nums[i]+"");
    	}
    	if(nums.length == 2)
    	{
    		String s1 = nums[0]+nums[1]+"";
    		if(NoOfOnes(s1)==NoOfZeros(s1))
    		{
    			return 2;
    		}
    	}
    	
    	
    	
    	for(int i=0;i<nums.length;i++)
    	{
    		for(int j=i;j<nums.length;j++)
    		{
    			String s1 = temp.substring(i,j+1);
    			if(NoOfOnes(s1) == NoOfZeros(s1))
    			{
    				if(integers.isEmpty())
    				{
    					integers.push(s1.length());
    				}
    				else if(integers.peek() < s1.length()){
    					integers.clear();
    					integers.push(s1.length());
    				}
    				else{
    					//Do Nothing
    				}
    			}
    			
    		}
    	}
    	return integers.peek();
    }
    public static void main(String[] args) {
		int[] arr = {0,1,0,1};
		System.out.println(findMaxLength(arr));
		
	}
}
