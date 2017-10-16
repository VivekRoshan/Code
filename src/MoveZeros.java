
public class MoveZeros {

	static int[] moveZeros(int[] a)
	{
		int k = 0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i] == 0)
			{
				a[i] = a[k];
				a[k] = 0;
				k++;
				
			}
		}
		return a;
	}
			
	public static void main(String[] args) {
		int[] arr = {1,2,3,0,0,0,4,1};
		arr = moveZeros(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		}
	
	}

}
