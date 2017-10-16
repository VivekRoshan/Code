import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SetCount {

	static boolean canMakeAllSame(String str1)
	{
	    int zeros = 0, ones = 0;
	 
	    char[] str = str1.toCharArray();
	    // Traverse through given string and
	    // count numbers of 0's and 1's
	    for (char ch : str)
	       if(ch =='0')
	    	   ++zeros; 
	       else
	    	   ++ones;
	 
	    // Return true if any of the two counts
	    // is 1
	    return (zeros == 1 || ones == 1);
	}
	 
	public static void main(String[] args) {
		int n = 9;
		List<String> str = Arrays.asList(Integer.toBinaryString(n).split(""));
		System.out.println(Collections.frequency(str, "1"));
		System.out.println(canMakeAllSame("10101"));
	}

}
