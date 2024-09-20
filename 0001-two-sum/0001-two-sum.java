class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        int[][] numsWI=new int[nums.length][2];
        
        for(int i=0;i<nums.length;i++){
            numsWI[i][0]=nums[i];
            numsWI[i][1]=i;
        }
        
        Arrays.sort(numsWI, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[0]-b[0];
            }
        });
        
        int left=0,right=nums.length-1;
        while(left<right){
            int sum=numsWI[left][0]+numsWI[right][0];
            if(sum==target){
                ans[0]=numsWI[left][1];
                ans[1]=numsWI[right][1];
                return ans;
            }else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        return ans;
    }
}