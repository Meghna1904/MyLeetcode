class Solution {
    public int maxProfit(int[] arr) {
        int i = 0;
        int max = 0;

        for (int j = 1; j < arr.length; j++) {

            if (arr[j - 1] > arr[j]) {
                int profit = arr[j - 1] - arr[i];

                if (profit > 0) {
                    max += profit;
                }

                i = j;
            }
        }

        // Sell at the last day if the final run was increasing
        if (i < arr.length - 1) {
            int profit = arr[arr.length - 1] - arr[i];

            if (profit > 0) {
                max += profit;
            }
        }

        return max;
    }
}