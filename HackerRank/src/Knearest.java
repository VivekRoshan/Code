import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class Point{
    int x, y;
    Point(int a,int b){
        x = a;
        y = b;
    }
    public String toString(){
        return "("+Integer.toString(x)+","+Integer.toString(y)+")";
    }
}
public class Knearest {
	
	public static double distance(Point a,Point b)
	{
			return Math.sqrt((Math.pow((b.x-a.x),2)+Math.pow((b.y-a.y),2)));
	}
	
	public static void main(String[] args) {
		int k =3;
		Comparator<Double> comparator = new Comparator<Double>() {
			
			
			@Override
			public int compare(Double o1, Double o2) {
				// TODO Auto-generated method stub
				return (o1>02)? 1 : -1;
			}
		};
		Point original1 = new Point(2, 2);
		Point original2 = new Point(1, 2);
		Point original3 = new Point(2, 3);
		Point original4 = new Point(4, 6);
		Point original5 = new Point(7, 9);
		
		List<Point> points = new ArrayList<>();
		points.add(original2);
		points.add(original3);
		points.add(original4);
		points.add(original5);
		
		PriorityQueue<Double> distances = new PriorityQueue<>(comparator);
		for(Point point: points)
		{
			Double dist = distance(original1, point);
			distances.add(dist);
		}
		
		Double[] dist = new Double[k];
		for(int i=0;i<k;i++)
		{
			dist[i] = distances.remove();
		}
		for(int j=0;j<k;j++)
		{
			for(int i=0;i<points.size();i++)
			{
		
				if(distance(original1,points.get(i)) == dist[j])
				{
					System.out.println(points.get(i).x+","+points.get(i).y);
					points.remove(points.get(i));					
					break;
				}
			}
		}
			
	}

}
