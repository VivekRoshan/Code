package bloomberg.practice;

public class ReverseInteger {

	public static void main(String[] args) {
		int num = 1234;
		int temp = num;
		temp = 12;
		System.out.println(num);
		
		int reverse =0;
		while(num>0)
		{
			int remainder = num % 10;
			num = num/10;
			reverse = reverse*10 + remainder;
			
		}
		System.out.println(reverse);
		System.out.println(new StringBuilder(temp+"").reverse());
		

	}

}
