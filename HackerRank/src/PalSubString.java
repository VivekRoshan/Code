import java.util.Stack;

public class PalSubString {
	public static boolean compare(String str1,StringBuilder str2)
	{
		for(int i=0;i<str1.length();i++)
		{
			if(!(str1.charAt(i)==str2.charAt(i)))
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		String s= "eerfetasdfghjkllkjhgfdsaytr";
		String s1 = new String();
		
		Stack<String> stack = new Stack<String>();
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				
				s1 = "";
				s1 = (s.substring(i, j));
				StringBuilder original =  new StringBuilder(s1);
				if(compare(s1, original.reverse()))
				{
					if(stack.isEmpty())
					{
						stack.push(original.toString());
					}
					else{
						if(stack.peek().length() == original.toString().length())
						{
							stack.add(original.toString());
						}
						else if(stack.peek().length() < original.toString().length())
						{
							stack.clear();
							stack.add(original.toString());
						}
						else
						{
							//Do Nothing
						}
					}
				}
			}
		}
		System.out.println(stack.pop().toString());
		
		
	}
	
	

}
