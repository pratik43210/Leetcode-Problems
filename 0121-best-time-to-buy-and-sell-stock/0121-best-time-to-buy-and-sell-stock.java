class Solution {
    public int maxProfit(int[] prices) {
        int minimal=prices[0];
        int maxProfit=0;
        int n=prices.length;

        for(int i=0;i<n;i++){
            int profit=prices[i]-minimal;
            maxProfit=Math.max(maxProfit,profit);
            minimal=Math.min(minimal,prices[i]);
        }

        return maxProfit;
    }
}