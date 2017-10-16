package bloomberg.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SortFrequency {

	static StringBuilder sortFrequency(String str)
	{
		char[] characters = str.toLowerCase().toCharArray();
		Map<Character, Integer> map = new TreeMap<>();
		int j=0;
		for (int i = 0; i < characters.length; i++) {
			if(map.containsKey(characters[i]))
			{
				map.put(characters[i], map.get(characters[i])+1 );
			}
			else
				map.put(characters[i],1);
			j = Math.max(j, map.get(characters[i]));
			//map.put(characters[i], (map.containsKey(characters[i]) ? map.get(characters[i])+1 :1 ));
		}
		
		List<Character>[] lists = new ArrayList[j+1];
		for(Character c: map.keySet())
		{
			int count = map.get(c);
			if(lists[count] == null)
			{
				lists[count] = new ArrayList<>();
			}
			lists[count].add(c);
		}
		StringBuilder sb = new StringBuilder();
	    for (int i = lists.length - 1; i > 0; i--) {
	        List<Character> list = lists[i];
	        if (list != null) {
	            for (Character c : list) {
	                for (j = 0; j < i; j++) {
	                    sb.append(c);
	                }
	            }
	        }
	    }
	    return sb;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sortFrequency("bloomberg"));
	}

}
