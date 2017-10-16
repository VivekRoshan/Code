import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
        char[] input = s.toCharArray();
        Set<Character> characters = new HashSet<>();
        for(int i=0;i<input.length;i++)
        {
        	characters.add(input[i]);
        }
        List<Character> characters2 = new ArrayList<Character>();
        characters2.addAll(characters);
        int i=0;
        while(i<4)
        {
        	String pattern= ".*(["+characters2.get(i) +"])\\1.*";
        	if(s.matches(pattern))
        	{
        		s = s.replaceAll(characters2.get(i)+"", "");
        		i++;
        	}
        	else{
        		i++;
        	}
        }
        
        System.out.println(s.length());
        
    }
}
