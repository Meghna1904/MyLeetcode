class Solution {
    public int maxProfit(int[] prices) {
       int i=0;
       int max=0;

       for(int j=1;j<prices.length;j++){
        if(prices[j]<prices[i]){
            i=j;
        }
        int profit=prices[j]-prices[i];
        if(profit>max){
            max=profit;
        }
       }
       return max;
    }
}