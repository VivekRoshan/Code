import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 * 
3
abcdde
baccd
eeabg
 */
public class Gemstones {
	public static String removeDuplicates(String string)
	{
		char[] chars = string.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (char c : chars) {
		    charSet.add(c);
		}

		StringBuilder sb = new StringBuilder();
		for (Character character : charSet) {
		    sb.append(character);
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		String[] input = new String[number];
        for(int  i=0;i<number;i++)
            {
            input[i] = scan.next();
        }
        
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<input.length;i++)
        {
        	input[i] = removeDuplicates(input[i]);
        	char[] temp = new char[input[i].length()];
        	temp = input[i].toCharArray();
        	for(int j=0;j<temp.length;j++)
        	{
        		if(map.containsKey(temp[j]))
        		{
        			Integer integer = map.get(temp[j]);
        			map.put(temp[j], integer+1);
        		}
        		else{
        			map.put(temp[j], 0);
        		}
        	}
        	
        }
        int answer =0 ;
        for(Character chars:map.keySet())
    	{
        	if(map.get(chars) == input.length-1)
        		answer++;
    	}
        System.out.println(answer);
        scan.close();
			
	}

}
