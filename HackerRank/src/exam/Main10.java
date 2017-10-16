package exam;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main10 {

	static class PQIntGT implements Comparator<Integer>{

		@Override
		public int compare(Integer o1, Integer o2) {
			return o2-o1;
		}
		
	}
	
	public static void main(String[] args) {
		PQIntGT comp = new PQIntGT();
		PriorityQueue<Integer> integers = new PriorityQueue<>();
		integers.add(10);
		integers.add(32);
		integers.add(5);
		integers.add(3);
		integers.add(54);
		integers.add(8);
		integers.add(100);
		while(integers.size() != 0){
			System.out.println(integers.poll());
		}
			
	}
}
