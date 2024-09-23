class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length; // size of the array
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            if(i>0 && nums[i]==nums[i-1]) continue;
            for (int j = i + 1; j < n; j++) {
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                int left=j+1;
                int right=n-1;
                //take the two pointers left and right
                while(left<right){
                    long sum=nums[i];
                    sum+= nums[j];
                    sum+= nums[left];
                    sum+= nums[right];
                    if(sum<target){
                        left++;
                    }else if(sum>target){
                        right--;
                    }else{
                        List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[left],nums[right]);
                        ans.add(temp);
                        left++;
                        right--;
                        while(left<right && nums[left]==nums[left-1]) left++;
                        while(left<right && nums[right]==nums[right+1]) right--;
                    }
                }
            }
        }
        

        return ans;
    }
}