class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int mini=(int)(n/3)+1;
        int cnt1=0,cnt2=0,el1=Integer.MIN_VALUE,el2=Integer.MIN_VALUE;
        List<Integer> ls=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            if(cnt1==0 && nums[i]!=el2){
                cnt1++;
                el1=nums[i];
            }else if(cnt2==0 && nums[i]!=el1){
                cnt2++;
                el2=nums[i];
            }else if(nums[i]==el1){
                cnt1++;
            }else if(nums[i]==el2){
                cnt2++;
            }else{
                cnt1--;
                cnt2--;
            }
        }
        
        cnt1=0;cnt2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==el1) cnt1++;
            if(nums[i]==el2) cnt2++;
        }
        
        if(cnt1>=mini) ls.add(el1);
        if(cnt2>=mini) ls.add(el2);
        
        return ls;
    }
}