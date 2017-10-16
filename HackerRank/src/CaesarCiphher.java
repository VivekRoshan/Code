import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CaesarCiphher {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        if(k >= 26)
        {
        	k = (k%26);
        }
        char[] characters = s.toCharArray();
        for(int i=0;i<characters.length;i++)
            {
            if(Character.isLetter(characters[i]) && (((Character.isLowerCase(characters[i]) && (int)characters[i]+k <= (int)'z') || (Character.isUpperCase(characters[i]) && ((int)characters[i]+k) <= (int)'Z'))))
                {
                characters[i] = (char)(((int)characters[i]+k));
                }
            else if(Character.isUpperCase(characters[i]) && ((int)characters[i]+k) > (int)'Z')
                {
                characters[i] = (char)((((int)characters[i]+k)%(int)'Z')+(int)'A'-1);
            }
            else if(Character.isLowerCase(characters[i]) && ((int)characters[i]+k) > (int)'z')
                {
                characters[i] = (char)((((int)characters[i]+k)%(int)'z')+(int)'a'-1);
            }
                    
        }
        String temp = new String();
        for(int i=0;i<characters.length;i++)
            {
            temp+=characters[i];
        }
        System.out.println(temp);
       
    }
}