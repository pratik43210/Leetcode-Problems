class Solution {
    public void nextPermutation(int[] nums) {
        List<Integer> A=new ArrayList<Integer>();
        for(int a:nums){
            A.add(a);
        }
        int idx=-1;
        int n=nums.length;
        
        for(int i=n-2;i>=0;i--){
            if(A.get(i)<A.get(i+1)){
                idx=i;
                break;
            }
        }
        
        if(idx==-1){
            Collections.reverse(A);
            for(int i=0;i<A.size();i++){
                nums[i]=A.get(i);
            }
            return;
        }
        
        for(int i=n-1;i>idx;i--){
            if(A.get(i)>A.get(idx)){
                Collections.swap(A,i,idx);
                break;
            }
        }
        
        List<Integer> sublist=A.subList(idx+1,n);
        Collections.reverse(sublist);
        
        for(int i=0;i<A.size();i++){
            nums[i]=A.get(i);
        }
    }
}