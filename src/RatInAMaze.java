
public class RatInAMaze {

	String str = "";
	boolean solveMaze(int[][] maze,int n)
	{
		int[][] sol = new int[n][n];
		if (solveMazeUtil(maze,sol,0, 0) == false)
        {
            System.out.print("Solution doesn't exist");
            return false;
        }
 
        printSolution(sol);
        return true;
	}
	boolean isSafe(int[][] maze,int i,int j,int n){
		if(i>=0 && i<=n-1 && j>=0 && j<=n-1 && maze[i][j] == 1)
			return true;
		return false;
		
	}
	boolean solveMazeUtil(int[][] maze,int[][] sol,int x, int y)
	{
		int N = sol.length;
		if(x == N-1 && y == N-1)
		{
			sol[x][y] = 1;
			return true;
		}
		if(isSafe(maze, x, y, N) ==true )
		{
			sol[x][y] = 1;
			if(solveMazeUtil(maze, sol, x+1, y))
			{	
				return true;
			}
			if(solveMazeUtil(maze, sol, x, y+1))
			{	
				return true;
			}
			if(solveMazeUtil(maze, sol, x-1, y))
			{	
				return true;
			}
			if(solveMazeUtil(maze, sol, x, y-1))
			{
				return true;
			}
			
			sol[x][y] = 0;
			return false;
			
		}
		return false;
	}
	void printSolution(int sol[][])
    {
        for (int i = 0; i < sol.length; i++)
        {
            for (int j = 0; j < sol.length; j++)
                System.out.print(" " + sol[i][j] +
                                 " ");
            System.out.println();
        }
    }
	
	public static void main(String[] args) {

		RatInAMaze aMaze = new RatInAMaze();
		int[][] maze = new int[][]{{1,1,1,0,0},
								   {0,0,1,1,0},
			                       {1,0,0,1,0},
			                       {1,1,0,1,1},
			                       {1,1,0,0,1}};
	    int maze1[][] = {{1, 0, 0, 0},
			            {1, 1, 0, 1},
			            {0, 1, 0, 0},
			            {1, 1, 1, 1}};
			aMaze.solveMaze(maze, 5); 
			aMaze.solveMaze(maze1, 4);
	}

}
