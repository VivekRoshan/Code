import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

class Result {
        int id, score;
        Result(int i, int s) { id = i; score = s; }
    }
public class Highest5Average {
	public static double getAverage(PriorityQueue<Integer> pq, int number){
	    double total = 0.0;
	    int count = number;
	    while(count >0 && !pq.isEmpty()){
	         total = total + pq.remove();
	         count--;;
	    }
	    return total/number;
	}

	public static Map<Integer, Double> top5Average(List<Result> result)
	{
		Map<Integer, Double> answer = new HashMap<>();
		if(result == null || result.size()==0) return answer;
		
		Map<Integer, PriorityQueue<Integer>> scores = new HashMap<Integer, PriorityQueue<Integer>>();
		for (Result result2 : result) {
			if(scores.containsKey(result2.id))
			{
				PriorityQueue<Integer> integers2 = scores.get(result2.id);
				integers2.add(result2.score);
				scores.put(result2.id, integers2);
				
			}
			else
			{
				PriorityQueue<Integer> integers = new PriorityQueue<>(Collections.reverseOrder());
				integers.add(result2.score);
				scores.put(result2.id, integers);
			}			
		}
		
		for(Integer integer:scores.keySet())
		{
			PriorityQueue<Integer> integers = scores.get(integer);
			double average = getAverage(integers, 5);
			answer.put(integer, average);
		}
		
		
		return answer;
	}
	public static void main(String[] args) {
		Result result1 = new Result(1,40);
		Result result2 = new Result(1,50);
		Result result3 = new Result(1,60);
		Result result4 = new Result(1,70);
		Result result5 = new Result(1,80);
		Result result6 = new Result(1,90);
		Result result7 = new Result(1,100);
		
		Result result8 = new Result(2,40);
		Result result9 = new Result(2,50);
		Result result10 = new Result(2,60);
		Result result11 = new Result(2,70);
		Result result12 = new Result(2,85);
		Result result13 = new Result(2,90);
		Result result14 = new Result(2,100);
		
		List<Result> list = new ArrayList();
		list.add(result1);list.add(result2);list.add(result3);list.add(result4);list.add(result5);
		list.add(result6);list.add(result7);

		list.add(result8);list.add(result9);list.add(result10);list.add(result11);list.add(result12);
		list.add(result13);list.add(result14);
		Map<Integer, Double> result= top5Average(list);
		
		for (Integer inte : result.keySet()) {
			System.out.println(inte+":"+result.get(inte));
			
		}
		
		
		

	}

}
