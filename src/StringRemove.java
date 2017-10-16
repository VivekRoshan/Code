import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringRemove {

	public static void main(String[] args) {
		String str1= "A Statement is a Statement", str2 = "Statement a";
		String[] s1 = str1.split(" ");
		String[] s2 = str2.split(" ");
		List<String> list1 = new ArrayList<>(Arrays.asList(s1));
		for (String string : s2) {
			if(Arrays.asList(s1).contains(string))
			{
				list1.remove(string);
			}
		}
		s1 = list1.toArray(new String[list1.size()]);
		System.out.println(String.join(" ", s1));

	}

}
