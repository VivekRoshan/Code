package bloomberg.practice;

public class ConvertorCurrency {

	static int[] getUSArray(int n)
	{
		int[] array = new int[n/3];
		int j =3;
		for(int i=0;i<array.length;i++)
		{
			array[i] = j;
			j += 3;
					
		}
		return array;
	}
	static int[] getIndianArray(int n)
	{
		int[] array = new int[(n-3/2)+1];
		int j =3;
		array[0] = j;
		for(int i=1;i<array.length;i++)
		{
			j += 2;
			array[i] = j;
			
					
		}
		return array;
	}
	public static void main(String[] args) {
		int num = 12345678;
		int n1 = num+"".length();
		int[] Indian = getIndianArray(n1);
		int[] US = getUSArray(n1);
		
		//num = Integer.parseInt(new StringBuilder(num+"").reverse().toString());
		int processed = 0;
		int reverse = 0;
		String result = "";
		int n = 0;
		while(num > 0)
		{
			if(processed == Indian[n] && processed !=0)
			//if(processed == US[n] && processed !=0)	
			{
				result += ",";
				n++;
			}
			//reverse = reverse*10+num%10;
			result += num%10;
			num = num/10;
			processed++;
			
			
			
		}
		System.out.println(new StringBuilder(result).reverse().toString());

	}

}
