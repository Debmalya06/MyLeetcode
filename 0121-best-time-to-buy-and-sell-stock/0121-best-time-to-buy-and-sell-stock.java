class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int sell = 0;
        int maxProfit = 0;
        
        for (int i = 0; i < prices.length; i++) {
          int curr = prices[i];
          buy = Math.min(curr,buy);
          maxProfit = Math.max(maxProfit,curr-buy);
        }
        
        return maxProfit;


    }
}