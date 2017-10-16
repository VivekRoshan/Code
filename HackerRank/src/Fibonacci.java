
public class Fibonacci {
	
	public static int fibonacci(int n)
	{
		if(n <= 1 ) return n;
		else return fibonacci(n-1)+ fibonacci(n-2); 
	}
	
	public static boolean prime(long n)
	{
		String str = n+"";
		int temp = Integer.parseInt(str.charAt(str.length()-1)+"");
		if(temp == 2 || temp == 4 || temp== 5 || temp ==6 || temp ==8 || temp == 0)
			return false;
		for(long i=2;i<=n/2;i++)
		{
			if(n%i == 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 20;
		String str= "";
		for(int i=1;i<=n;i++){
			int temp = fibonacci(i);
			System.out.println(i + ":"+ temp);
			str += temp+"";
		}
		System.out.println(str);
		int i= 0;
		while(true)
		{
			
			String str2 = str.substring(i);
			if(str2.length() >= 10)
			{
				str2 = str2.substring(0, 10);
				System.out.println(str2);
				if(prime(Long.parseLong(str2)))
					System.out.println("Prime " + str2);
				else
					System.out.println("Not Prime " + str2);
				
			}
			else
				break;
			i++;
		}
		
	}

}
