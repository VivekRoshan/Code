package bloomberg.practice;

import java.util.LinkedList;

public class Graph {

	public int V;
	public LinkedList<Integer> adj[];
	Graph(int v){
		V = v; 
		adj = new LinkedList[V];
		for (int i = 0; i < V; i++) {
			adj[i] = new LinkedList<>();
		}
	}
	public void addEdge(int u,int v)
	{
		adj[u].add(v);
		adj[v].add(u);
	}
	public Boolean isCyclicUtil(int v, Boolean visited[],int parent)
	{
		visited[v] = true;
		LinkedList<Integer> list = adj[v];
		for (Integer integer : list) {
			if(!visited[integer])
			{
				if(isCyclicUtil(integer, visited, v))
					return true;
			}
			else if(integer != parent)
				return true;	
		}
		return false;
	}
	public Boolean isTree()
	{
		Boolean visited[] = new Boolean[V];
        for (int i = 0; i < V; i++)
            visited[i] = false;
        if(isCyclicUtil(0, visited, -1))
        	return false;
        
        for (int i = 0; i < V; i++) {
			if(!visited[i])
				return false;
		}
        return true;
	}
	public Boolean isCyclic()
	{
		Boolean visited[] = new Boolean[V];
        for (int i = 0; i < V; i++)
            visited[i] = false;
        for(int u=0;u<V;u++)
        {
        	if(!visited[u])
        		if(isCyclicUtil(u, visited, -1))
        			return true;
        }
        return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g1 = new Graph(5);
        g1.addEdge(1, 0);
        g1.addEdge(0, 2);
        g1.addEdge(0, 3);
        g1.addEdge(3, 4);
        if (g1.isTree())
            System.out.println("Graph is Tree");
        else
            System.out.println("Graph is not Tree");
 
        if (g1.isCyclic())
            System.out.println("Graph is cyclic");
        else
            System.out.println("Graph is not cyclic");

        Graph g2 = new Graph(5);
        g2.addEdge(1, 0);
        g2.addEdge(0, 2);
        g2.addEdge(2, 1);
        g2.addEdge(0, 3);
        g2.addEdge(3, 4);
 
        if (g2.isTree())
            System.out.println("Graph is Tree");
        else
            System.out.println("Graph is not Tree");
        
        if (g2.isCyclic())
            System.out.println("Graph is cyclic");
        else
            System.out.println("Graph is not cyclic");

	}

}
