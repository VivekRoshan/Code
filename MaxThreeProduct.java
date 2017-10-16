package bloomberg.practice;

import java.util.Arrays;

public class MaxThreeProduct {

	public static void main(String[] args) {
		int[] array = {2,1,4,1,5,-3,-4};
/*		Arrays.sort(array);
		int a = array[0]*array[1]*array[array.length-1];
		int b = array[array.length-1]*array[array.length-2]*array[array.length-3];
		System.out.println(Math.max(a, b));
*/
	int max1 = Integer.MIN_VALUE;
	int max2 = Integer.MIN_VALUE;
	int max3 = Integer.MIN_VALUE;
	int min1 = Integer.MAX_VALUE;
	int min2 = Integer.MAX_VALUE;
	for (int n : array) {
		if(n > max1){
			max3 = max2;
			max2 = max1;
			max1 = n;
			
		}
		else if(n>max2)
		{
			max3 = max2;
			max2 = n;
		}
		else if(n>max3)
		{
			max3 = n;
		}
		if (n < min1) {
            min2 = min1;
            min1 = n;
        } else if (n < min2) {
            min2 = n;
        }
    }
 System.out.println(Math.max(max1*max2*max3, max1*min1*min2));

	}	
	}

