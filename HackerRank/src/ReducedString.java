import java.io.*;
import java.util.*;

public class ReducedString {
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        while(true)
        {
        	int len = s.length();
        	s = s.replaceAll("(.)\\1", "");
        	if(s.length() == len)
        	{
        		break;
        	}
        }
        scan.close();	
        System.out.println( (s.isEmpty()) ? "Empty String" : s);
        
    }
}