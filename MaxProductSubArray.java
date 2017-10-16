package bloomberg.practice;

public class MaxProductSubArray {

	static public int maxProduct(int[] A) {
	    if (A.length == 0) {
	        return 0;
	    }
	    
	    int maxherepre = A[0];
	    int minherepre = A[0];
	    int maxsofar = A[0];
	    int maxhere, minhere;
	    
	    for (int i = 1; i < A.length; i++) {
	        maxhere = Math.max(Math.max(maxherepre * A[i], minherepre * A[i]), A[i]);
	        minhere = Math.min(Math.min(maxherepre * A[i], minherepre * A[i]), A[i]);
	        maxsofar = Math.max(maxhere, maxsofar);
	        maxherepre = maxhere;
	        minherepre = minhere;
	    }
	    return maxsofar;
	}
	
	static int maxProduct(int A[], int n) {
	    // store the result that is the max we have found so far
	    int r = A[0];

	    // imax/imin stores the max/min product of
	    // subarray that ends with the current number A[i]
	    for (int i = 1, imax = r, imin = r; i < n; i++) {
	        // multiplied by a negative makes big number smaller, small number bigger
	        // so we redefine the extremums by swapping them
	        if (A[i] < 0)
	            {
	        	int temp = imax;
	        	imax = imin;
	        	imin = temp;
	        	//swap(imax, imin);
	            }

	        // max/min product for the current number is either the current number itself
	        // or the max/min by the previous number times the current one
	        imax = Math.max(A[i], imax * A[i]);
	        imin = Math.min(A[i], imin * A[i]);

	        // the newly computed max value is a candidate for our global result
	        r = Math.max(r, imax);
	    }
	    return r;
	}
	static int maxCustomProduct(int[] arr)
	{
		int maxprev = arr[0];
		int minprev = arr[0];
		int minhere,maxhere;
		int maxsofar = arr[0];
		for (int i = 1; i < arr.length; i++) {
			maxhere = Math.max(Math.max(arr[i]*minprev, arr[i]*maxprev), arr[i]);
			minhere = Math.min(Math.min(arr[i]*minprev, arr[i]*maxprev), arr[i]);
			maxsofar = Math.max(maxsofar, maxhere);
			maxprev = maxhere;
			minprev = minhere;
		}
		return maxsofar;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ressult =maxProduct(new int[]{0,0,0,0,0,20}, 6);
		System.out.println(ressult);
		System.out.println(maxProduct(new int[]{0,0,0,0,0,20}));
		System.out.println(maxCustomProduct(new int[]{0,0,0,0,0,20}));
	}

}
