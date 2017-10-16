package exam;

class Structure{
	int x;
	public Structure(int xx) {
		// TODO Auto-generated constructor stub
		x= xx;
	}
}
public class Main8 {

	public static void f(Structure st, Structure r_st,int a[],int n)
	{
		st = new Structure(st.x);
		st.x++;
		r_st.x++;
		a[0]++;
		n++;
	}
	
	public static void main(String[] args) {
		Structure ss0 = new Structure(0);
		Structure ss1 = new Structure(1);
		int[] ia = {0};
		int m=0;
		f(ss0,ss1,ia,m);
		System.out.println(ss0.x);
		System.out.println(ss1.x);
		System.out.println(ia[0]);
		System.out.println(m);
 	}

}
