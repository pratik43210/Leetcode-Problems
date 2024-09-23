class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length; // size of the array
        Set<List<Integer>> set = new HashSet<>();

        

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                Set<Long> hashSet=new HashSet<>();
                for(int k=j+1;k<n;k++){
                    long sum=nums[i];
                    sum+=nums[j];
                    sum+=nums[k];
                    long fourth=target-sum;
                    if(hashSet.contains(fourth)){
                        List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[k],(int) fourth);
                        Collections.sort(temp);
                        set.add(temp);
                    }
                    hashSet.add((long)nums[k]);
                }
            }
        }
        
        List<List<Integer>> ans=new ArrayList<>(set); 

        return ans;
    }
}