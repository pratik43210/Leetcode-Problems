class Solution {
    public int majorityElement(int[] nums) {
        // int n=nums.length;
        // for(int i=0;i<nums.length;i++){
        //     int count=0;
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[i]==nums[j]) count++;
        //     }
        //     if(count>n/2) return nums[i];
        // }

        // HashMap<Integer, Integer> map=new HashMap<>();
        // int n=nums.length;
        // for(int i=0;i<n;i++){
        //     if(map.containsKey(nums[i])){
        //         map.put(nums[i],map.get(nums[i])+1);
        //     }
        //     else{
        //         map.put(nums[i],1);
        //     }
        // }

        // for(int key:map.keySet()){
        //     if(map.get(key)>(float)n/2) return key;
        // }

        int cnt=0,n=nums.length;
        int el=nums[0];

        for(int i=0;i<n;i++){
            if(cnt==0){
                el=nums[i];
                cnt++;
            }else if(nums[i]==el){
                cnt++;
            }else cnt--;
        }

        int cnt1=0;
        for(int i=0;i<n;i++){
            if(nums[i]==el) cnt1++;
        }

        if(cnt1>n/2) return el;

        return -1;
    }
}