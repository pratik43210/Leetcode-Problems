class Solution {
    static int f(int i, int j, int[][] dp){
        if(i==0 && j==0) return 1;
        if(i<0||j<0) return 0;
        
        if(dp[i][j]!=-1) return dp[i][j];
        
        int left=f(i,j-1,dp);
        int up=f(i-1,j,dp);
        
        return dp[i][j]=up+left;
    }
    public int uniquePaths(int m, int n) {
        int i=m-1,j=n-1;
        int[][] dp=new int[m][n];
        for (int[] row : dp){
            Arrays.fill(row, -1);
        }
        return f(i,j,dp);
    }
}