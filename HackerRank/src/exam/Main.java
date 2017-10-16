package exam;

public class Main {

	public static int f(int n)
	{
		int c=3;
		return c = (n%2 !=0 )? c+1: n+10;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println(f(0));
	System.out.println(f(1));
	System.out.println(f(2));
	}

}
