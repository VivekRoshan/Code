import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FunnyString {
    public static String funnyString(String s)
        {
        StringBuilder s1 = new StringBuilder(s);
        s1 = s1.reverse();
        int counter = 0;
        for(int i=1;i<s.length();i++)
            {
            int i1 = Math.abs((int)s.charAt(i) - (int)s.charAt(i-1));
            int i2 = Math.abs((int)s1.charAt(i) - (int)s1.charAt(i-1));
            if(i1 != i2)
                return "Not Funny";
            else{
                counter++;
            }
        }
        if(counter == s.length()-1)
            return "Funny";
        else
            return "Not Funny";
        
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        String[] input = new String[number];
        for(int  i=0;i<number;i++)
            {
            input[i] = scan.next();
            System.out.println(funnyString(input[i]));
        }
        
        
        
        
        
        
        
    }
}