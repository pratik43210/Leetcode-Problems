class Solution {
    public List<Integer> generateRow(int r){
        int ans=1;
        List<Integer> ansRow=new ArrayList<>();
        ansRow.add(1);
        for(int c=1; c<r; c++){
            ans=ans*(r-c);
            ans=ans/c;
            ansRow.add((int)ans);
        }
        
        return ansRow;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int r=1;r<=numRows;r++){
            ans.add(generateRow(r));
        }
        
        return ans;
    }
    // public void main(String[] args) {
    //     int n = 5;
    //     List<List<Integer>> ans = generate(n);
    //     for (List<Integer> it : ans) {
    //         for (int ele : it) {
    //             System.out.print(ele + " ");
    //         }
    //         System.out.println();
    //     }
    // }
}