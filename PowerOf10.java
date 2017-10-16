package practice;

public class PowerOf10 {

	public static boolean isPower(int n)
	{
		if(n==10 || n==1)
		{
			return true;
		}
		if(n==0)
			return false;
		if(n % 10 != 0)
			return false;
		return isPower(n/10);
	}
	public static void main(String[] args) {
		int num = 0;
		while(num>0)
		{
			if(num % 10 == 0)
			{
				num = num/10;
			}
			else if(num == 1)
			{
				System.out.println("Yes");
				break;
			}
			else{
				System.out.println("Not" + num);
				break;
			}
		}
		
		System.out.println(isPower(1));

	}

}
