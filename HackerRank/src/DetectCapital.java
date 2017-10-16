import javax.security.auth.DestroyFailedException;

public class DetectCapital {
    public static boolean detectCapitalUse(String word) {
        char[] chars = word.toCharArray();
        boolean flag = false;
        for(int i=0;i<chars.length;i++)
        {
            if(Character.isUpperCase(chars[i]))
            {
                if(word.matches("[A-Z]*"))
                {
                	flag = true;
                }
                else if(word.matches("[A-Z][a-z]*"))
                {
                	flag = true;
                }
                
            }
            else if(Character.isLowerCase(chars[i]))
            {
            	if(word.matches("[a-z]*"))
            	{
            		flag = true;
            	}
            }
        }
        return flag;
        
    }
    public static void main(String[] args) {
		String s= "Usa";
		System.out.println(detectCapitalUse(s));
	
	}
}