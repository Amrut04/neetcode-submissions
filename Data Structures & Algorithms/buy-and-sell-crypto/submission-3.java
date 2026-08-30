class Solution {
    public int maxProfit(int[] prices) {
      int profit=0;
      int buyStock = prices[0];

      for(int i=0;i<prices.length;i++){
        if(buyStock > prices[i]){
            buyStock = prices[i];
        }else{
            int currentPrice = prices[i] - buyStock;
            profit = Math.max(profit,currentPrice);
        }

      } 
      return profit; 
    }
}
