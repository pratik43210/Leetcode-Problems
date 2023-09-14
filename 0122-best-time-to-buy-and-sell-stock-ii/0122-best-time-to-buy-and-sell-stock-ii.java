class Solution {
    public int maxProfit(int[] prices) {
        int currMinimal = prices[0];
        int profit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>currMinimal){
                profit +=prices[i]-currMinimal;
            }
            currMinimal=prices[i];
        }
        return profit;
    }
}