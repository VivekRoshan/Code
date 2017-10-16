import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Brackets{
	public static boolean isThereChar(char[] chaArray, char chr){
	    boolean bool = false;
	    for(int i=0; i < chaArray.length; i++)
	            {
	                if(chr == chaArray[i]){
	                    bool = true;
	                }
	            }
	            return bool;
	}
    public static String reverse(String chr)
    {
    	String temp=" ";
    	if(chr.equals("{"))
    		temp = "}";
    	if(chr.equals("("))
    		temp = ")";
    	if(chr.equals("["))
    		temp = "]";
    	return temp;
    }
    public static boolean isBalanced(String expression) {
       Boolean flag=true; 
       Stack<String> solver = new Stack<String>();
       char[] exp = expression.toCharArray();
       char[] open = {'{','(','['};
       char[] close = {'}',']',')'};
       for(int i=0;i<exp.length;i++)
       {
    	   if(isThereChar(open,exp[i]))
    	   {
    		   solver.push(exp[i]+"");
    	   }
    	   
    	   else if (isThereChar(close, exp[i]) && !solver.isEmpty()) {
    		   String temp= solver.pop();
    		   temp = reverse(temp);
			   if((!((exp[i]+"").equals(temp))))
			   {
				   flag=false;
			   }
    		   
    		   
		} else {
			flag=false;
		}
       }
       return flag; 
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}