package bloomberg.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

class Compare implements Comparator<Character>
{

	Map<Character, Integer> map = new HashMap<>();
	public Compare(Character[] chars) {
		for (Character c : chars) {
			map.put(c, (map.containsKey(c) ? map.get(c)+1 : 1 ));
		}
	}
	
	@Override
	public int compare(Character o1, Character o2) {
		Integer get1 = map.get(o1);
		Integer get2 = map.get(o2);
		if(get1 == get2)
			return o1.compareTo(o2);
		return get2.compareTo(get1 );
	}
	
}
public class SortString {

	public static String sortCharacters(String str)
	{
		Character[] characters = new Character[str.length()];
		for (int i = 0; i < str.length(); i++) {
			characters[i] = str.charAt(i);
		}
		Compare compare = new Compare(characters);
		Arrays.sort(characters,compare);
		String result = "";
		for (int i = 0; i < characters.length; i++) {
			result+= characters[i];
		}
		return result;
	}
	public static void main(String[] args) {
		String str  = "bloomberg";
		str = sortCharacters(str);
		System.out.println(str);

	}

}
