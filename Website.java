package bloomberg.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class Web implements Comparable<Web>{
	String url;
	int numOfVisits = 0;
	public Web(String url) {
		this.url = url;
		this.numOfVisits = 1;
	}


	@Override
	public int compareTo(Web o) {
		return this.url.compareTo(o.url);
	}
	
	@Override
	public boolean equals(Object arg0) {
		Web web = (Web)arg0;
		return this.url.equals(web.url);
	}
}
public class Website{
	PriorityQueue<Web> queue = new PriorityQueue<>(new Comparator<Web>() {

		@Override
		public int compare(Web o1, Web o2) {
			Integer i1 = o1.numOfVisits;
			Integer i2 = o2.numOfVisits;
			if(i1 != i2)
				return i2.compareTo(i1);
			else
				return o1.url.compareTo(o2.url);

		}
	});
	void visit(String url)
	{
		Web web = new Web(url);
		if(!queue.contains(web))
		{
			queue.add(web);
		}
		else
		for (Web web1 : queue) {
			if(url.equals(web1.url))
			{
				web1.numOfVisits += 1;
			}
		}
	}
	void PrintTop5()
	{
		Queue<Web> queue = new LinkedList<>();
		queue=this.queue; 
		System.out.println(queue.size());
		System.out.println(this.queue.size());
		for (int i=0; i<5;i++) {
			Web web = queue.poll();
			System.out.println(web.url+" "+web.numOfVisits);
		}
	}
	public static void main(String[] args) {
/*		Web web1 =  new Web("www.google.com");
		Web web2 =  new Web("nytimes.com");
		Web web3 =  new Web("guardian.co.uk");
		Web web4 =  new Web("dev.ibm.com");
		Web web5 =  new Web("www.yahoo.co.in");
*/		Website website = new Website();
		website.visit("www.google.com");
		website.visit("nytimes.com");
		website.visit("guardian.co.uk");
		website.visit("dev.ibm.com");
		website.visit("www.yahoo.co.in");
		website.visit("www.yahoo.co.in");
		website.visit("www.yahoo.co.in");
		website.visit("www.facebook.com");
		website.PrintTop5();
	}
}
