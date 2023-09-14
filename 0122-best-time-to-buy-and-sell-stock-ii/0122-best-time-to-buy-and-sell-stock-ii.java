class Solution {
    public int maxProfit(int[] prices) {
        int currMinimal = prices[0];
        int profit = 0;
        for(int i=1;i<prices.length;i++){
            //selling wrt current minimal if current price is higher than current minimal
            if(prices[i]>currMinimal){
                // consecutive sales give illusion of buying at one day and selling ata later more profitable date
                profit +=prices[i]-currMinimal;
            }
            //if price<minimal it is updated. if price>minimal,it is sold wrt to current minimal and then minimal is updated
            //as minimal moves only further along day and updates on each sale it gives the illusion of having only one stock at a time
            //updating minimal for price<minimal gives the illusion of buying a new stock on lower price in case we sell wrt to that minimal later upon encountering greater price value
            // we are setting minimal to the day we sell in case of price>minimal
            currMinimal=prices[i];
        }
        return profit;
    }
}