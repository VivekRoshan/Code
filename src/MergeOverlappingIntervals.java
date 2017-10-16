import java.util.Arrays;
import java.util.Comparator;

public class MergeOverlappingIntervals {

    private static Integer[][] intervals = { 
        {1, 3}, 
        {2, 6}, 
        {7, 11},
        {8, 10} 
        
    };
    
    private static void print(Integer[] tuple) {
        System.out.println(
            String.format("[%d, %d]", tuple[0], tuple[1]));
    }

    public static void main(String[] args) {
        Arrays.sort(intervals, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return o1[0].compareTo(o2[0]);
            }
        });
        
        int index = 1;
        Integer[] interval = intervals[0];
        while(index < intervals.length) {
            Integer[] nextInterval = intervals[index];
            
            if (interval[1] >= nextInterval[0]) {
                interval[0] = Math.min(interval[0], nextInterval[0]);
                interval[1] = Math.max(interval[1], nextInterval[1]);
            }
            else {
                print(interval);
                interval = nextInterval;
            }
            
            index++;
        }
        print(interval);
    }   
}