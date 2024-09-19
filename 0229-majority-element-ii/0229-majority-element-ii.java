class Solution {
    public List<Integer> majorityElement(int[] nums) {
        //NOTE: At max only two numbers can exist which occur more than floor of n/3 times
        int n=nums.length;
        int mini=(int)(n/3)+1;
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> ls=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            int value=map.getOrDefault(nums[i],0);
            map.put(nums[i], value+1);
            
            //we don't have to worry about reapeating values because we
            //add a value to list only once when occurence=mini
            if(map.get(nums[i])==mini) ls.add(nums[i]);
            
            //if list has got 2 elements, we break the loop
            if(ls.size()==2) break;
        }
        
        return ls;
    }
}