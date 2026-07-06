class Solution {
    public int maxProfit(int[] prices) {
        int buy_stock = prices[0];

        int profit = 0;

        for(int i=0;i<prices.length;i++){

            if(buy_stock>prices[i]){
                buy_stock = prices[i];
            }else{
                int current_profit = prices[i]-buy_stock;
                profit = Math.max(current_profit,profit);
            }

        }
        return profit;
    }
}
