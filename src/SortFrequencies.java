import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

class FrequencyComparator implements Comparator<Integer>{

	HashMap<Integer, Integer> hashMap = new HashMap<>();
	
	public FrequencyComparator(Integer[] input) {
		for (Integer integer : input) {
			this.hashMap.put(integer, (hashMap.get(integer) != null ? hashMap.get(integer)+1 : 1 ));
		}
		
	}
	
	public int compare(Integer o1, Integer o2) {
		if(hashMap.get(o1) == hashMap.get(o2))
			return o1.compareTo(o2);
		return (hashMap.get(o1) < hashMap.get(o2)) ? 1 :-1;
	}
	
}
public class SortFrequencies {

	public static void main(String[] args) {
		Integer[] input = new Integer[] { 2,3,5,3,7,9,5,3,7 };
		// Sort the array using custom comparator
		Arrays.sort(input, new FrequencyComparator(input));
		// Print the result
		for (Integer i : input)
			System.out.print(i + " ");
	}
	}


