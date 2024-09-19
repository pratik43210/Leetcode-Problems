**Recursive solution**
​
class Solution {
public int countPaths(int i, int j, int m, int n){
*//when reaching the end coordinate return 1*
if(i==m-1 && j==n-1) return 1;
//on crossing the bounds of array return zero
if(i>=m || j>=n) return 0;
//i+1 goes down and j+1 goes left thus summation of these two give path
return countPaths(i+1,j,m,n)+countPaths(i,j+1,m,n);
}
public int uniquePaths(int m, int n) {
return countPaths(0,0,m,n);
}
}
​
**Better solution (using dynamic programming)**
class Solution {
public int countPaths(int i, int j, int m, int n, int[][] dp){
if(i==m-1 && j==n-1) return 1;
if(i>=m || j>=n) return 0;
if(dp[i][j]!=-1) return dp[i][j];
return dp[i][j]=countPaths(i+1,j,m,n,dp)+countPaths(i,j+1,m,n,dp);
}
public int uniquePaths(int m, int n) {
int[][] dp=new int[m][n];
for(int i=0;i<m;i++){
for(int j=0;j<n;j++){
dp[i][j]=-1;
}
}