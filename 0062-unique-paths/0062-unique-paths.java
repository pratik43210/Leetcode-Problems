class Solution {
    public int uniquePaths(int m, int n) {
        //we start at 0,0 so, possible steps in right = m-1
        //possible steps in downward direction = n-1
        //total number of possible steps
        int N = m+n-2;
        // we can either find total combination by finding
        //nCr for the n-1 right paths or m-1 down paths
        int r= m-1;
        
        double res=1;
        
        for(int i=1;i<=r;i++){
            res=res*(N-r+i)/i;
        }
        
        return (int)res;
    }
}