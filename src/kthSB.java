
public class kthSB {

	public static void main(String[] args) {
		int n = 16;
		int k =4;
		int shift = 1<<(k-1);
		System.out.println(shift);
		System.out.println((n&(shift) ) );
			
	}

}
