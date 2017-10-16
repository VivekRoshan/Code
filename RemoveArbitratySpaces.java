package bloomberg.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveArbitratySpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = " The Sky is  blue ";
		
		System.out.println(str);
		System.out.println(str.trim());
		
/*		Pattern pattern = Pattern.compile("\\s*(\\S*)\\s*"); // Pattern not okay
		Matcher m = pattern.matcher(str);
		str = m.matches()? m.group(1) : str;
*/
		str = str.replaceAll("^\\s+|\\s+$|(\\s)+", "$1"); //test.replaceAll("^ +| +$|( )+", "$1")
		System.out.println(str);
	}

}
