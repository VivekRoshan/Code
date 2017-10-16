package algorithms.sorting;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SortingString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }
        
        Comparator<String> comparator = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				
			Integer len1 = o1.length();
			Integer len2 = o2.length();
			if(len1.equals(len2)){
				return o1.compareTo(o2); 
			}
			else{
				return len1.compareTo(len2);
			}
			
			}
		};
        // your code goes here
        Arrays.sort(unsorted, comparator);
        for(int i=0; i<unsorted.length;i++)
        {
            System.out.println(unsorted[i]);
        }

	}

}
