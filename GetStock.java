package bloomberg.practice;

public class GetStock {


	public int maxProfit(int[] prices) {
		int currentMin = 0;
		int maxDiff = 0;
		int sell = 0;
		int buy = 0;
		for (int i = 0; i < prices.length; i++) {
			if(prices[i] < prices[currentMin])
			{
				currentMin = i;
			}
			int difference = prices[i]-prices[currentMin];
			if(difference > maxDiff)
			{
				maxDiff = difference;
				sell = i;
				buy = currentMin;
			}

		}
		System.out.println("buy "+buy);
		System.out.println("sell "+ sell);
		System.out.println(maxDiff);
			
		return maxDiff;
		
		
		
	}
	public static void main(String[] args) {
	
	GetStock stock = new GetStock();
	System.out.println(stock.maxProfit(new int[]{7, 2,3,6,1,2}));
	//System.out.println(stock.maxProfit(new int[]{6,5,4,3,2,1}));
	}

}
