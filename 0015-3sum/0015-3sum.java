class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        
        Arrays.sort(nums);
        
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int left=i+1,right=n-1;
            
            while(left<right){
                long sum=(long)nums[i]+nums[left]+nums[right];
                
                if(sum<0){
                    left++;
                }else if(sum>0){
                    right--;
                }else{
                    ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                    while(left<right && nums[left]==nums[left-1]) left++;
                    while(left<right && nums[right]==nums[right+1]) right--;
                }
            }
        }
        
        return ans;
    }
}