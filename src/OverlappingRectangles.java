import java.util.Scanner;
import java.util.Stack;

class Point{
	int x;
	int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}
public class OverlappingRectangles {

 	static boolean overlap(Point p[])
	{
		boolean flag = true;
		if(p[3].y > p[0].y || p[1].y > p[2].y)
			flag = false;
		if(p[0].x > p[3].x || p[2].x > p[1].x)
			flag = false;
		return flag;
	}
 	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();	
		for (int i = 0; i < n; i++) {
			Point point[]= new Point[4];
			for (int j = 0; j < point.length; j++) {
				point[j] = new Point(in.nextInt(), in.nextInt());
			}
			
		System.out.println(overlap(point));
		}
		in.close();
		
	}
}
