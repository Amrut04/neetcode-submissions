//buy_stock
//current_profit
//profit
class Solution {
    public int maxProfit(int[] prices) {
       int buy = prices[0];
       int profit = 0;

       for(int i=0;i<prices.length;i++){
        if(buy>prices[i]){
            buy = prices[i];
        }else{
            int current_proft = prices[i] - buy;
            profit = Math.max(current_proft,profit);
        }
       } 
       return profit;
    }
}
