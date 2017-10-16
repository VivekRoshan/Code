package bloomberg.practice;

public class RemoveExtraString {


	public static void main(String[] args) {
		String str = "Hello Wold Memory One ZetaByte";
		String str2 = "Wold ZetaByte";
		String[] a1 = str.split(" ");
		String[] a2 = str2.split(" ");
		for (String string : a2) {
			if(str.contains(string))
			{
				str = str.replace("(.*)"+string+"(.*)", "yo");
				System.out.println(str);
			}
		}
	}
}
