class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0, maxi=0,si=0,ei=0;
        boolean allNegative=true;
        
        for(int i:nums){
            if(i>0){
                allNegative=false;
            }
        }
        
        if(allNegative){
            sum=nums[0];
            maxi=nums[0];
            
            for(int i=0;i<nums.length;i++){
                sum=nums[i];
                
                if(sum>maxi){
                    maxi=sum;
                }
            }
            
            return maxi;
        }
        
        for(int i=0;i<nums.length;i++){
            if(sum==0)si=i;
            
            sum+=nums[i];
            
            if(sum>maxi){
                maxi=sum;
                ei=i;
            }
            
            if(sum<0){
                sum=0;
            }
        }
        
        return maxi;
    }
}