import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Stringab {

	public static String removeRepetitions(String s)
	{
		String temp = new String();
		temp = s;
		while(true)
        {
        	int len = temp.length();
        	temp = temp.replaceAll("(.)\\1", "");
        	if(temp.length() == len)
        	{
        		break;
        	}
        }
		return temp;
        
	}
	public static boolean repetetions(String s)
	{
		if(s.matches(".*(.)\\1.*"))
			return true;
		else
			return false;
	} 
	public static List<String> pairs(List<Character> characters2)
	{
		List<String> pairs = new ArrayList<>();
		for(int i=0;i<characters2.size();i++)
		{
			for(int j=i+1;j<characters2.size();j++)
			{
				pairs.add(characters2.get(i)+""+characters2.get(j)+"");
			}
		}
		return pairs;
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String s = scan.next();
        char[] input = s.toCharArray();
        int max= 0;
        if(s.length()==0)
        {
        	max = 0;
        }
        Set<Character> characters = new HashSet<>();
        for(int i=0;i<input.length;i++)
        {
        	characters.add(input[i]);
        }
        List<Character> characters2 = new ArrayList<Character>();
        characters2.addAll(characters);
        characters.clear();
        List<String> pairsab = pairs(characters2);
        System.out.println(pairsab);
        
        Map<String,Integer> map = new HashMap<String,Integer>();
        
        for(int i=0;i<pairsab.size();i++){
        String pattern = "[^"+pairsab.get(i).charAt(0)+pairsab.get(i).charAt(1)+"]";
        String temp = new String();
        temp= s;
        temp = temp.replaceAll(pattern, "");
        if(repetetions(temp))
        {
        	//Do Nothing
        }
        else{
        	map.put(pairsab.get(i), temp.length());	
        }
        }

        for(String string:map.keySet())
        {
        	if(map.get(string) > max)
        	{
        		max = map.get(string);
        	}
        }
        
        System.out.println(max);
        
        scan.close();   
	}
}
