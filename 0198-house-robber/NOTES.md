**Solution 1 (Memoization)**
​
class Solution {
public static int robHouse(int[] nums, int n , int[] dp){
//base condition
if(n==0) return nums[n];
if(n<0) return 0;
//if for a particular function call,
//dp[n]!=-1, meaning that fucntion is solved,
//we just return the return value of function
//which is dp[n]
if(dp[n]!=-1) return dp[n];
//we either pick current value or not
//if we pick current we cannot pick adjacent (n-1)
//instead, we go to n-2 index
int pick=nums[n] + robHouse(nums,n-2,dp);
//we dont pic the curretn a
int notPick=robHouse(nums,n-1,dp);
//dp[n] stores the return value of the function
return dp[n]=Math.max(pick,notPick);
}
public int rob(int[] nums) {
int n=nums.length;
//didn't do n+1, we will be changing the last index
//which should be n-1 so we prepare a dp array of n size
int[] dp=new int[n];
for(int i=0;i<n;i++){
dp[i]=-1;
}
//we put n-1 as that would be the index
return robHouse(nums,n-1,dp);
}
}
​
**Explanation**
​
In this code, a recursive solution with memoization is used to solve the "House Robber" problem. The problem asks for the maximum amount of money that can be robbed from a row of houses, with the constraint that two adjacent houses cannot be robbed on the same night.
​
The robHouse function is the core of this solution, using recursion to calculate the maximum money that can be robbed up to the nth house. The base cases handle situations where the recursion reaches the start of the list (n == 0, in which case the function returns the value of the first house), or when n becomes negative (n < 0, which means no valid houses are left to rob, so the function returns 0).
​
Memoization is used to optimize the recursive solution by storing intermediate results in the dp array. Before performing any computation for a particular house n, the function checks whether the result for that house has already been computed by looking at dp[n]. If the value is not -1, it means the result is already stored and can be returned immediately, avoiding redundant calculations.
​
The main logic involves two options: either rob the current house (pick) or skip it (notPick). If the current house is robbed, the amount of money from the nth house is added to the result of robbing the houses up to n-2, since the adjacent house n-1 cannot be robbed. If the current house is skipped, the function proceeds to evaluate the result of robbing the houses up to n-1. The function then returns the maximum of these two options, which is stored in dp[n] to memoize the result.
​
In the rob method, the length of the array is first determined. The dp array is then initialized with size n, where each element is set to -1 to indicate that no results have been computed yet. Finally, the robHouse function is called with n-1 as the argument, representing the last house in the array, and the result is returned.
​
The time complexity of this solution is O(n), as each house is processed only once due to memoization. The space complexity is also O(n) because of the additional storage required for the dp array.
​
**Solution 2 (Tabulation)**
​
​