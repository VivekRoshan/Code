public class MinCoinChange {
	

	public int minCoinsRequired(int amount, int[] coins) {
		int[] coinReq = new int[amount+1];
		int[] CC = new int[coins.length];
		coinReq[0] = 0; 
		for (int amt = 1; amt <= amount; amt++) {
			for (int j = 0; j < CC.length; j++) {
				CC[j] = -1;
			}
			for (int j = 0; j < coins.length; j++) {
				if (coins[j] <= amt) { 
					CC[j] = coinReq[amt - coins[j]] + 1; 
				}
			}
			coinReq[amt]=-1;
			for(int j=1;j<CC.length;j++){
				if(CC[j]>0 && (coinReq[amt]==-1 || coinReq[amt]>CC[j])){
					coinReq[amt]=CC[j];
				}
			}
		}
		return coinReq[amount];
		
	}

	public static void main(String[] args) {
		int[] coins = { 1,3,5};
		int amount = 20;
		MinCoinChange m = new MinCoinChange();		
		System.out.println(m.minCoinsRequired(amount, coins));
	}

}