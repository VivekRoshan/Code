package bloomberg.practice;

import java.util.Arrays;
import java.util.Comparator;

public class MergeOverlappingIntervals {
	private static Integer[][] intervals = { 
	        {1, 3}, 
	   
	        {7, 11},
	        {2, 6},
	        {8, 10} 
	        
	    };
	    
	    private static void print(Integer[] tuple) {
	        System.out.println(
	            String.format("[%d, %d]", tuple[0], tuple[1]));
	    }
	    public static void main(String[] args) {
			int index = 1;
			Arrays.sort(intervals,new Comparator<Integer[]>() {

				@Override
				public int compare(Integer[] arg0, Integer[] arg1) {
					return arg0[0].compareTo(arg1[0]);
				}
			});
			Integer[] interval = intervals[0];
			while(index < intervals.length)
			{
				Integer[] nextInterval = intervals[index];
				if(interval[1] > nextInterval[0])
				{
					interval[0] = Math.min(interval[0], nextInterval[0]);
					interval[1] = Math.max(interval[0],nextInterval[1]);
				}
				else{
					print(interval);
					interval = nextInterval;
				}
				index++;
			}
			print(interval);
			
		}



}
