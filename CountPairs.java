package bloomberg.practice;

import java.util.HashMap;
import java.util.Map;

public class CountPairs {

	public static void main(String[] args) {
		int arr[] = new int[]{1, 5, 7, 3, 5} ;
		int sum = 10;
		int count = 0;
		Map<Integer,Integer> map = new HashMap<>();
		for (int i : arr) {
			if(map.containsKey(i))
			{
				Integer in = map.get(i);
				map.put(i, in+1);
			}
			else{
				map.put(i, 1);
			}
		}
		for (int i=0; i<arr.length; i++) {
			if(map.containsKey(sum - arr[i]))
			{
				count += map.get(sum-arr[i]);
			}
			if (sum-arr[i] == arr[i])
                count--;
		}
		System.out.println(count/2);

	}

}
