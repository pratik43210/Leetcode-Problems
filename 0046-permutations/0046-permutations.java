class Solution {
    private void recursivePermutation(int[] arr,List<List<Integer>> ans,List<Integer> ds, boolean[] map){
        if(ds.size()==arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i=0;i<arr.length;i++){
            if(!map[i]){
                map[i]=true;
                ds.add(arr[i]);
                recursivePermutation(arr,ans,ds,map);
                ds.remove(ds.size()-1);
                map[i]=false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        boolean[] map=new boolean[nums.length];
        recursivePermutation(nums,ans,ds,map);
        return ans;
    }
}