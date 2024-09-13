class Solution {
    public void nextPermutation(int[] nums) {
        List<Integer> A=new ArrayList<>();
        int n=nums.length;
        for(int i: nums){
            A.add(i);
        }
        
        int idx=-1;
        for(int i=n-2;i>=0;i--){
            if(A.get(i)<A.get(i+1)){
                idx=i;
                break;
            }
        }
        
        if(idx==-1){
            for(int i=0;i<n;i++){
                nums[i]=A.get(n-i-1);
            }
            return;
        }
        
        for(int i=n-1;i>idx;i--){
            if(A.get(i)>A.get(idx)){
                Collections.swap(A,idx,i);
                break;
            }
        }
        
        List<Integer> sublist=A.subList(idx+1,n);
        Collections.reverse(sublist);
        
        for(int i=0;i<n;i++){
            nums[i]=A.get(i);
        }
        return;
    }
}