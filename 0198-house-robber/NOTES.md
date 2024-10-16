The main logic involves two options: either rob the current house (pick) or skip it (notPick). If the current house is robbed, the amount of money from the nth house is added to the result of robbing the houses up to n-2, since the adjacent house n-1 cannot be robbed. If the current house is skipped, the function proceeds to evaluate the result of robbing the houses up to n-1. The function then returns the maximum of these two options, which is stored in dp[n] to memoize the result.
​
In the rob method, the length of the array is first determined. The dp array is then initialized with size n, where each element is set to -1 to indicate that no results have been computed yet. Finally, the robHouse function is called with n-1 as the argument, representing the last house in the array, and the result is returned.
​
The time complexity of this solution is O(n), as each house is processed only once due to memoization. The space complexity is also O(n) because of the additional storage required for the dp array.
​
**Solution 2 (Tabulation)**
​
class Solution {
public int rob(int[] nums) {
int n=nums.length;
int[] dp= new int[n];
dp[0]=nums[0];
for(int i=1;i<n;i++){
int take=nums[i];
if(i>1) take+=dp[i-2];
int leave=dp[i-1];
dp[i]=Math.max(take,leave);
}
return dp[n-1];
}
}
​
​