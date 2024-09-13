class Solution {
    public List<Integer> generateRow(int r){
        List<Integer> ansRow=new ArrayList<>();
        int res=1;
        ansRow.add(res);
        for(int c=1;c<r;c++){
            res=res*(r-c);
            res=res/c;
            ansRow.add(res);
        }
        return ansRow;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            List<Integer> row=generateRow(i);
            ans.add(row);
        }
        return ans;
    }
}