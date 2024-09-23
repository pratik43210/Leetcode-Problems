class Solution {
    public int longestConsecutive(int[] a) {
        int n = a.length;
        if(n==0) return 0;
        
        int longest=1;
        
        Set<Integer> set=new HashSet<>();
        
        for(int i:a){
            set.add(i);
        }
        
        for(int it:set){
            if(!set.contains(it-1)){
                int cnt=1;
                int x=it;
                
                while(set.contains(x+1)){
                    x++;
                    cnt++;
                }
                longest=Math.max(longest,cnt);
            }
        }
        
        return longest;
    }
}