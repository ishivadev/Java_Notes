package practiceQuestions;

public class StockBuyAndSell {

	public static void main(String[] args) {

		int prices[] = {2, 4, 5, 1, 6, 7};
		
		int min = Integer.MAX_VALUE;
		int maxprofit = 0;

		for(int p : prices)
		{
			if( p < min)
			{
				min = p;
			}
			else {
				maxprofit = Math.max(maxprofit, ( p - min ));
			}
		}
		
		
		System.out.println("Profit is : "  + maxprofit);
	}

}
