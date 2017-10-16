import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Count {
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();
		str = str.toLowerCase();
		char[] arr = str.toCharArray();
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				Integer temp = map.get(arr[i]);
				map.put(arr[i], temp+1);
			}
			else
			{
				map.put(arr[i], 1);
			}
		}
		
		for(Character cha:map.keySet())
		{
			System.out.println(cha+":"+map.get(cha));
		}
 		
	}

}
