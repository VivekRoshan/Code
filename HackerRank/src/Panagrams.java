import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Panagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
        s = s.replaceAll("\\s", "");
        Map<Character,Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for(int i=0;i<chars.length;i++)
        {
        	if(Character.isUpperCase(chars[i]))
        	{
        		chars[i] = Character.toLowerCase(chars[i]);
        		map.put(chars[i], i);
        	}
        	else if(Character.isLowerCase(chars[i])){
        		map.put(chars[i], i);
        	}
        }
        
        if(map.size() == 26)
        {
        	System.out.println("pangram");
        }
        else{
        	System.out.println("not pangram");
        }
        
        

	}

}
