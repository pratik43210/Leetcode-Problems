class Solution {
//     private void recursivePermutation(int[] arr,List<List<Integer>> ans,List<Integer> ds, boolean[] map){
//         if(ds.size()==arr.length){
//             ans.add(new ArrayList<>(ds));
//             return;
//         }
        
//         for(int i=0;i<arr.length;i++){
//             if(!map[i]){
//                 map[i]=true;
//                 ds.add(arr[i]);
//                 recursivePermutation(arr,ans,ds,map);
//                 ds.remove(ds.size()-1);
//                 map[i]=false;
//             }
//         }
//     }
    private void recurPermutation(int idx, int[] arr, List<List<Integer>> ans){
        if(idx==arr.length){
            List<Integer> ds=new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                ds.add(arr[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i=idx;i<arr.length;i++){
            swap(i,idx,arr);
            recurPermutation(idx+1,arr,ans);
            swap(i,idx,arr);
        }
    }
    private void swap(int i, int j, int[] arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        // List<Integer> ds=new ArrayList<>();
        // boolean[] map=new boolean[nums.length];
        // recursivePermutation(nums,ans,ds,map);
        recurPermutation(0,nums,ans);
        return ans;
    }
}