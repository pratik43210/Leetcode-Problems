class Solution {
    public static int robHouse(int[] nums, int n , int[] dp){
        //base condition
        if(n==0) return nums[n];
        if(n<0) return 0;
        
        if(dp[n]!=-1) return dp[n];
        
        //we either pick current value or not
        //if we pick current we cannot pic adjacent
        //we go to current-2 index
        int pick=nums[n] + robHouse(nums,n-2,dp);
        
        int notPick=robHouse(nums,n-1,dp);
        
        return dp[n]=Math.max(pick,notPick);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        
        for(int i=0;i<n;i++){
            dp[i]=-1;
        }
        
        return robHouse(nums,n-1,dp);
    }
}