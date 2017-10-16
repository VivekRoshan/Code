package algorithms.sorting;

import java.util.ArrayList;
import java.util.List;

public class Merge{

	public static List<Integer> merge(List<Integer> l1, List<Integer> l2 )
	{
		List<Integer> result = new ArrayList<>();
		int i = 0;
		int j = 0;
		while(i<l1.size() || j<l2.size())
		{
			if(i<l1.size() && j<l2.size()){
				if(l1.get(i) < l2.get(j))
				{
					result.add(l1.get(i));
					i++;
				}
				else{
					result.add(l2.get(j));
					j++;
				}
			}
			else if(i<l1.size())
			{
				result.add(l1.get(i));
				i++;
			}
			else if(j<l2.size())
			{
				result.add(l2.get(j));
				j++;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> integers = new ArrayList<>();
		integers.add(3);integers.add(27);integers.add(38);integers.add(43);
		List<Integer> integers1 = new ArrayList<>();
		integers1.add(9);integers1.add(10);integers1.add(82);
		List<Integer> result = merge(integers, integers1);
		for (Integer integer : result) {
			System.out.println(integer);
		}
	}

}
