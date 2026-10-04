class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        int minPrice =prices[0];
        for(int i=1; i<prices.length; i++){
            int profit = prices[i]-minPrice;
            res = Math.max(res,profit);
            minPrice = Math.min(minPrice,prices[i]);
        }
        return res;
}}