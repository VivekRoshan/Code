
public class Sample {
	
	public static boolean isPowerOfTwo (int x)
	{
	 while (((x % 2) == 0) && x > 1) /* While x is even and > 1 */
	   x /= 2;
	 if(x==1)
	 return true;
	 else
		 return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPowerOfTwo(65));
	}

}
