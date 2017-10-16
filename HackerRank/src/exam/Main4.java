package exam;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> first = new HashSet<>(Arrays.asList("Magneto"));
		Set<String> second = new HashSet<>(Arrays.asList("Storm","Spike"));
		Set<String> third = new HashSet<>(Arrays.asList("QS","Toad"));
		Set<String> fourth = second;
		Set<String> fifth = new HashSet<>();
		
		if(! fourth.isEmpty()){
			Set<String> t = fourth;
			fourth = fifth;
			fifth =t;
		}
		System.out.println(fourth.isEmpty()? 0 :1);
		
		
	}

}
