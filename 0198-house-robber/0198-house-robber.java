class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp= new int[n];
        dp[0]=nums[0];
        
        //we already have dp[0] and leave will account for it
        //when calculating dp[1] so we start loopinf from 1
        for(int i=1;i<n;i++){
            //nums[i] will be the amount robbed in current house
            int take=nums[i];
            
            //dp[i-2] is the maximun amount robbed till i-2
            //since we rob current house, we leave i-1(adjacent)
            //so we take max amount robbed till i-2
            if(i>1) take+=dp[i-2];
            
            //dp[i-1] is maximum amount robbed till i-1
            //we left current so we consider max till i-1
            int leave=dp[i-1];
            
            //max amount robbed till current house
            dp[i]=Math.max(take,leave);
        }
        
        
        return dp[n-1];
    }
}