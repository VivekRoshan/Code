package exam;

public class Main9 {

	public static void main(String[] args) {
		String tampa = "tampa";
		String florida = "florida";
		tampa = tampa.substring(3, 5)+tampa.charAt(2);
		int co = florida.indexOf(tampa.charAt(1));
		florida = tampa+florida.substring(co, co+1);
		System.out.println(florida);
		
				
	}

}
