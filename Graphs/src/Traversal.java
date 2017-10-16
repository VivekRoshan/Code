import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

class Graph{
	private static final String NEWLINE = System.getProperty("line.separator");
	int V;
	LinkedList<Integer> adj[];
	public Graph(int v) {
		V = v;
		adj = new LinkedList[V];
		for (int i = 0; i < V; i++) {
			adj[i] = new LinkedList<>() ;
			
		}
	}
	public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(V + " " +NEWLINE);
        for (int v = 0; v < V; v++) {
            s.append(v + ": ");
            for (Integer e : adj[v]) {
                s.append(e + "  ");
            }
            s.append(NEWLINE);
        }
        return s.toString();
    }
	void addEdge(int u,int v)
	{
		adj[u].add(v);
	}
	void BFS(int s)
	{
		boolean visited[] = new boolean[this.V];
		LinkedList<Integer> queue = new LinkedList<>();
		queue.add(s);
		visited[s] = true;
		while(!queue.isEmpty())
		{
			int source = queue.poll();
			System.out.print(source+" ");
			LinkedList<Integer> adjacent = adj[source];
			for (Integer integer : adjacent) {
				if(visited[integer] != true)
				{
					visited[integer] = true;
					queue.add(integer);
				}
			}
		}
		System.out.println();
		
		
	}
	void DFS(int s)
	{
		boolean visited[] = new boolean[this.V];
		Stack<Integer> stack = new Stack<>();
		stack.add(s);
		while(!stack.isEmpty())
		{
			int source = stack.pop();
			LinkedList<Integer> adjacent = adj[source];
			if(visited[source] != true)
			{
				System.out.print(source+" ");
				visited[s] = true;
			}
			for (Integer integer : adjacent) {
				if(visited[integer] != true)
				{
					stack.push(integer);
				}
			}
		}
		System.out.println();
		
		
	}
	
}
public class Traversal {
	public static void main(String[] args) {
		 Graph g = new Graph(5);
	       /* g.addEdge(0, 1);
	        g.addEdge(0, 2);
	        g.addEdge(1, 2);
	        g.addEdge(2, 0);
	        g.addEdge(2, 3);
	        g.addEdge(3, 3);
	       */ System.out.println(g.toString());
	        g.addEdge(0, 2);
	        g.addEdge(0, 3);
	        g.addEdge(2, 1);
	        g.addEdge(3, 4);
	        g.addEdge(1, 0);
	        g.addEdge(4, 0);
	       
	        g.BFS(2);
	        g.DFS(0);
	}

}
