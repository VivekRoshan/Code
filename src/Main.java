import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
  public static void main(String[] args) throws IOException {
   /* BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s;
    while ((s = in.readLine()) != null) {
      System.out.println(s);
    }*/
    String s= "Rkbs,5453; Wdqiz,1245; Rwds,3890; Ujma,5589; Tbzmo,1303;";
    String[] str = s.split(";");
    List<Integer> integer = new ArrayList<Integer>();
    for(int i=0;i<str.length;i++)
    {
        integer.add(Integer.parseInt(str[i].split(",")[1] ));
    }
    System.out.println(integer);
    Collections.sort(integer);
    System.out.println(integer);
    List<Integer> integers = new ArrayList<>();
    for(int i=1;i<integer.size();i++)
    {
    	integers.add(integer.get(i)-integer.get(i-1));
    }
    integers.add(0, integer.get(0));
    System.out.println(integers);
    String ans = integers.toString();
    System.out.println(ans.substring(1, ans.length()-2));
    for(int j=0;j<integers.size();j++)
    {
    	
    }
    
    
	String str2 = "https://yahoo.com/movies/index.html";
	String result = "";
	String[] protocol = str2.split("/");
	String[] query = str2.split("\\?");
	if(protocol.length >= 3)
	{
		result+=protocol[0];
		result = result.replaceAll(":", "");
		result+=","+protocol[2];
	}
	if(query.length >=2)
	{
		result += ","+query[1];
	}
	System.out.println(result);
  }
}
