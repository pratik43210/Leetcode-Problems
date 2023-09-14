class Solution {
    public int maxProfit(int[] prices) {
        int currMinimal = prices[0];
        int profit = 0;
        for(int i=1;i<prices.length;i++){
            //selling wrt current minimal if current price is higher than current minimal
            if(prices[i]>currMinimal){
                profit +=prices[i]-currMinimal;
            }
            //if price<minimal it is updated. if price>minimal,it is sold wrt to current minimal and then minimal is updated
            //as minimal moves only further along day and updates on each sale it gives the illusion of having only one stock at a time
            currMinimal=prices[i];
        }
        return profit;
    }
}