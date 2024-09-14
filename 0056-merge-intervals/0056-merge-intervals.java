class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[0]-b[0];
            }
        });
        
        List<int[]> ans=new ArrayList<>();
        
        for(int i=0;i<n;i++){
//             int start=intervals[i][0];
//             int end=intervals[i][1];
            
//             if(!ans.isEmpty() && end<=ans.get(ans.size()-1)[1]){
//                 continue;
//             }
            
//             for(int j=i+1;j<n;j++){
//                 if(intervals[j][0]<=end){
//                     end=Math.max(end,intervals[j][1]);
//                 }else{
//                     break;
//                 }
//             }
//             int[] finalnterval={start,end};
//             ans.add(finalnterval);
            
            if(ans.isEmpty()||intervals[i][0]>ans.get(ans.size()-1)[1]){
                ans.add(intervals[i]);
            }else{
                ans.get(ans.size()-1)[1]=Math.max(intervals[i][1],ans.get(ans.size()-1)[1]);
            }
        }
        
        int s=ans.size();
        int[][] ansArr=new int[s][2];
        for(int i=0;i<s;i++){
            ansArr[i]=ans.get(i);
        }
        
        return ansArr;
    }
}