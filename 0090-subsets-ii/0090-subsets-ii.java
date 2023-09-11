class Solution {
    private void uniqueSubsets(int idx,int[] a, List<List<Integer>> ans, List<Integer> ds){
        ans.add(new ArrayList<>(ds));
        
        for(int i=idx;i<a.length;i++){
            if(i>idx && a[i]==a[i-1]) continue;
            
            ds.add(a[i]);
            uniqueSubsets(i+1,a,ans,ds);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        uniqueSubsets(0,nums,ans,new ArrayList<>());
        return ans;
    }
}