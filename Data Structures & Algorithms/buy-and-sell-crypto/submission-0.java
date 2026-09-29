class Solution {
    public int maxProfit(int[] prices) {
        int maxB = 0;
        int minB = prices[0];

        for(int sell : prices){
            maxB = Math.max(maxB,sell - minB);
            minB = Math.min(minB,sell);
        }
        return maxB;
    }
}
