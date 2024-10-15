for(int i=2;i<=n;i++){
dp[i]=dp[i-1]+dp[i-2];
}
return dp[n];
}
}
​
**Explanation**
​
In the code, the dynamic programming approach is used to efficiently solve the "Climbing Stairs" problem by calculating the number of ways to reach each step iteratively. This method avoids the overhead of recursion, making the solution more efficient.
​
The program starts by initializing a dp array with a size of n+1, where each element dp[i] will represent the number of ways to reach the ith step. The base cases are set as dp[0] = 1 and dp[1] = 1, indicating that there is only one way to stay on the ground (step 0) and one way to take a single step (step 1).
​
Next, the code enters a loop from i = 2 to n, where dp[i] is computed as the sum of dp[i-1] (the number of ways to reach the previous step) and dp[i-2] (the number of ways to reach the step two steps back). This ensures that each value is calculated only once, avoiding the repeated computations that would occur in a recursive approach.
​
Finally, the program returns dp[n], which contains the total number of ways to climb to the top of the staircase.
​
The time complexity of this solution is O(n), as each step is processed exactly once, and the space complexity is also O(n) due to the dp array.