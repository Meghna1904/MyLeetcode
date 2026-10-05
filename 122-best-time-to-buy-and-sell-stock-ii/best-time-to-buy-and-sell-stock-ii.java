class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;

        for (int j = 1; j < prices.length; j++) {
            if (prices[j] > prices[j - 1]) {
                max += prices[j] - prices[j - 1];
            }
        }

        return max;
    }
}