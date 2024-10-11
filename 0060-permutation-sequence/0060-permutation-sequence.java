class Solution {
    public String getPermutation(int n, int k) {
        int fact=1;
        ArrayList<Integer> nums=new ArrayList<>();
        for(int i=1; i<n;i++){
            fact*=i;
            nums.add(i);
        }
        nums.add(n);
        String ans="";
        k=k-1;
        while(nums.size()!=0){
            ans=ans+nums.get(k/fact);
            nums.remove(k/fact);
            k=k%fact;
            if(nums.size()!=0) fact=fact/nums.size();
        }
        
        return ans;
    }
}