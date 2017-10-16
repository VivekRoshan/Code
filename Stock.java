package bloomberg.practice;

public class Stock {

	public int maxProfit(int[] prices) {
		if(prices.length == 0)
			return 0;
		int max = Integer.MIN_VALUE;
		int minSoFar = 0;
		minSoFar = prices[0];
		for(int i=0;i<prices.length;i++)
		{
			if(minSoFar>prices[i])
				minSoFar = prices[i];
			else
				if(max < prices[i]-minSoFar)
					max = prices[i]-minSoFar;
		}
		return max;
	}
	public static void main(String[] args) {
	
	Stock stock = new Stock();
	System.out.println(stock.maxProfit(new int[]{7, 2,3,6,1,2}));
	System.out.println(stock.maxProfit(new int[]{6,5,4,3,2,1}));
	}

}
