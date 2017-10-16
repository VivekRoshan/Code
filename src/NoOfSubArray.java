import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NoOfSubArray {
	void function(int[] arr, int k) {

        int size = arr.length;
        // list is used to print the pairs
        Map<Integer, List<Integer>> hashMap = new HashMap<Integer, List<Integer>>();
        
        int currentSum = 0;
        for (int index = 0; index < size; index++) {
                currentSum += arr[index];
                List<Integer> list = hashMap.get(currentSum % k);
                if (null != list) {
                        list.add(index);

                } else {
                        list = new ArrayList<Integer>();
                        list.add(index);
                }
                hashMap.put(currentSum % k, list);
        }
        
        int noOfSubArray = 0;
        for(Map.Entry<Integer, List<Integer>> entry : hashMap.entrySet()) {
                Integer key = entry.getKey();
                Integer listSize = entry.getValue().size();
                if(key == 0) {
                        noOfSubArray += (listSize*(listSize+1))/2;
                } else {
                        noOfSubArray += (listSize*(listSize-1))/2;
                }
        }
        
        System.out.println("No of subArray in O(k+n) time complexity "+noOfSubArray);
 }
	private static void findSequenceDivisibleBy(int[] arr, int num) {
		int result = 0;
		for(int i=0;i<arr.length;i++)
		{
			List<Integer> integers = new ArrayList<>();
			int sum = 0;
			for(int j=0;j<arr.length-i;j++)
			{
				sum += arr[i+j];
				integers.add(arr[i+j]);
				if(sum % num == 0)
				{
					result++;
					System.out.println(integers);
				}
				
			}
			
		}
		System.out.println(result);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoOfSubArray array = new NoOfSubArray();
		int[] arr = {1,2,3,4,1};
		array.function(arr,3);
		findSequenceDivisibleBy(arr, 3);
	}

}
