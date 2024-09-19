class Solution {
    public List<Integer> majorityElement(int[] nums) {
        //NOTE: At max only two numbers can exist which occur more than floor of n/3 times
        int n=nums.length;
        List<Integer> ls=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            //either list is empty or current number is not already in list
            //only then we proceed to count
            if(ls.size()==0||ls.get(0)!=nums[i]){
                int cnt=0;
                for(int j=0;j<n;j++){
                    if(nums[j]==nums[i]){
                        cnt++;
                    }
                }
                
                if(cnt>(n/3)){
                    ls.add(nums[i]);
                }
            }
            
            if(ls.size()==2) break;
        }
        
        return ls;
    }
}