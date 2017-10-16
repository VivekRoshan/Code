import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Puuji {
	public static void fileAppender(Double currentnum,Double newNum,String currentOperation)
	{
		try{
		String savestr = "mysave.txt"; 
		File f = new File(savestr);

		PrintWriter out = null;
		if ( f.exists() && !f.isDirectory() ) {
		    out = new PrintWriter(new FileOutputStream(new File(savestr), true));
		    out.append("\n"+currentnum+""+currentOperation+""+newNum);
		    out.close();
		}
		else {
		    out = new PrintWriter(savestr);
		    out.println(currentnum+""+currentOperation+""+newNum );
		    out.close();
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		fileAppender(2.0, 5.0, "+");
		
	}

}
