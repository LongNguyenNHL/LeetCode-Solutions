class Solution {
    public int maxProfit(int[] prices) {
        int profit;
        int maxProfit = 0;
        int begin = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > begin) {
                profit = prices[i] - begin;
                if (maxProfit < profit) {
                    maxProfit = profit;
                }
            } else {
                begin = prices[i];
            }
        }
        return maxProfit;
    }
}