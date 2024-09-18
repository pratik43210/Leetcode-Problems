class Solution {
    public int majorityElement(int[] nums) {
        int count=0,n=nums.length,el=nums[0];
        
        for(int i=0;i<n;i++){
            if(count==0){
                el=nums[i];
                count++;
            }else if(nums[i]==el){
                count++;
            }else{
                count--;
            }
        }
        
        int count1=0;
        for(int i=0;i<n;i++){
            if(nums[i]==el) count1++;
        }
        
        if(count1>=n/2) return el;
            
        return -1;
    }
}