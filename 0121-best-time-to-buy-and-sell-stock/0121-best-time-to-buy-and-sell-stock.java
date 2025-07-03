class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = Integer.MAX_VALUE;
        int n = prices.length;

        for(int i=0; i<n; i++) {
            if(prices[i] < buy) {
                buy = prices[i];
            } else if(prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }
        }
        return profit;
    }
}