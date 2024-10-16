class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        //if there's only one house to rob
        if(n==1) return nums[0];
        
        //maintains max money for (curr-2)th house
        //we start at calculating current from 2nd house
        //so prev2 will be 0 and prev will be nums[0]
        //whilch is money robbed in first house
        int prev2=0;
        //maintains max money till (curr-1)th house
        int prev=nums[0];
        
        //loop from 1 to n-1 and calculate current max for each
        for(int i=1;i<n;i++){
            //if we rob current house, we have to consider max till prev2
            int take=nums[i]+prev2;
            
            //if we leave current house, consider max till last house
            int leave=prev;
            
            //calculate current max
            int curr=Math.max(take,leave);
            //prev2 will be now max prev(max money robbed till prev house)
            prev2=prev;
            //prev will now be equal to curr(max profit till current house)
            prev=curr;
            //we move to next iteration
        }
        
        //prev's final value will be the last current value
        //that will be our answer
        return prev;
    }
}