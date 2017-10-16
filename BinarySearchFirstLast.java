package bloomberg.practice;

public class BinarySearchFirstLast {

	static int BinSearchFirst(int[] arr,int x)
	{
		int low = 0;
		int high = arr.length;
		
		int result = -1;
		while(low <= high)
		{
			int mid = (low+high)/2;
			if(arr[mid] == x){
				result = mid;
				high = mid-1;
			}
			else if(x > arr[mid])
			{
				low = mid+1;
			}
			else{
				high = mid -1;
			}
			
		}
		return result;
	}
	static int BinSearchLast(int[] arr,int x)
	{
		int low = 0;
		int high = arr.length;
		
		int result = -1;
		while(low <= high)
		{
			int mid = (low+high)/2;
			if(arr[mid] == x){
				result = mid;
				low = mid+1;
			}
			else if(x > arr[mid])
			{
				low = mid+1;
			}
			else{
				high = mid -1;
			}
			
		}
		return result;
	}
	static int BinSearchFirstRecursive(int[] arr,int low, int high,int n,int x)
	{
		if(low <= high)
		{
			int mid = low + (high - low)/2;
			if((mid == 0 || x> arr[mid-1]) && arr[mid] == x)
				return mid;
			else if(x > arr[mid])
				return BinSearchFirstRecursive(arr, mid+1, high, n,x);
			else
				return BinSearchFirstRecursive(arr, low, mid-1, n, x);
			
		}
		return -1;
	}
	static int BinSearchLastRecursive(int[] arr,int low, int high,int n,int x)
	{
		if(low <= high)
		{
			int mid = low + (high - low)/2;
			if((mid == n-1 || x < arr[mid+1]) && arr[mid] == x)
				return mid;
			else if(x < arr[mid])
				return BinSearchFirstRecursive(arr, low, mid-1, n,x);
			else
				return BinSearchFirstRecursive(arr, mid+1, high, n, x);
			
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr = {2,3,5,5,5,6,7,8,10};
		int x = 5;
		System.out.println(BinSearchFirst(arr, x));
		System.out.println(BinSearchLast(arr, x));
		System.out.println(BinSearchFirstRecursive(arr, 0, arr.length, arr.length, x));
		System.out.println(BinSearchLastRecursive(arr, 0, arr.length, arr.length, x));
	}
}
