class Solution {
    public int maxProfit(int[] prices) {
        int minB = prices[0];
        int maxP = 0;
        for(int sell : prices){
            minB = Math.min(minB,sell);
            maxP = Math.max(maxP,sell-minB);
        }
        return maxP;
    }
}
