package bloomberg.practice;

public class SortSquare {

	public static int[] sortSquare(int[] arr)
	{
		int k=0;
		for (k = 0; k < arr.length; k++) {
			if(arr[k] > 0)
				break;
		}
		int i = k-1;
		int j = k;
		int n = arr.length;
		int[] temp = new int[arr.length];
		int z =0 ;
		while(i >= 0 && j<n)
		{
			if(arr[i]*arr[i] < arr[j]*arr[j] )
			{
				temp[z++] = arr[i]*arr[i];
				i--;
			}
			else{
				temp[z++] = arr[j]*arr[j];
				j++;
			}
			
		}
		while(i >=0)
		{
			temp[z++] = arr[i]*arr[i];
			i--;
		}
		while(j < n)
		{
			temp[z++] = arr[j]*arr[j];
			j++;
		}
		return temp;
		
	}
	public static void main(String[] args) {
		int[] temp = sortSquare(new int[]{-4,-3,-1,0,1,2,3,4});
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]+" ");
		}
	}

}
