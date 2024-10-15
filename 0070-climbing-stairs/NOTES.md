**Solution 1 (Memoization+Recursion) **
​
class Solution {
private static int helper(int n, int[] dp){
if(n<=1) return 1;
if(dp[n]!=-1) return dp[n];
return dp[n]=helper(n-1,dp)+helper(n-2,dp);
}
public int climbStairs(int n) {
int[] dp = new int[n+1];
for (int i = 0; i <= n; i++) {
dp[i]=-1;
}
return helper(n,dp);
}
}
​
TC=O(n) as n recursive calls were made and SC=O(n) (for recursive call) +O(n) (for array)