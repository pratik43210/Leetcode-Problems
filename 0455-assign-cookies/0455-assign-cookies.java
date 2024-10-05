class Solution {
    public int findContentChildren(int[] g, int[] s) {
        //sort the greed and size arrays
        Arrays.sort(g);
        Arrays.sort(s);
        
        //create a greed index and size index, initiate with 0
        int gi=0,si=0;
        
        //
        while(gi<g.length && si<s.length){
            if(g[gi]<=s[si]){
                gi++;
            }
            si++;
        }
        
        return gi;
    }
}