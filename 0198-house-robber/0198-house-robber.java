class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
        
        int prev2=0;
        int prev=nums[0];
        
        for(int i=1;i<n;i++){
            int take=nums[i]+prev2;
            
            int leave=prev;
            
            int curr=Math.max(take,leave);
            prev2=prev;
            prev=curr;
        }
        
        
        return prev;
    }
}