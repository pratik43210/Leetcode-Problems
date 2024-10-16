//we left current so we consider max till i-1
int leave=dp[i-1];
//max amount robbed till current house
dp[i]=Math.max(take,leave);
}
return dp[n-1];
}
}
​
**Explanation**
In this code, a dynamic programming approach is used to solve the "House Robber" problem iteratively. The goal is to find the maximum amount of money that can be robbed from a row of houses, given that two adjacent houses cannot be robbed on the same night.
​
The program starts by determining the length n of the nums array, which holds the amount of money in each house. A dp array of size n is initialized, where each element dp[i] will store the maximum amount of money that can be robbed up to the ith house. The base case is set with dp[0] = nums[0], as when there is only one house, the only option is to rob it.
​
The algorithm then iterates over the houses starting from index 1. For each house i, two options are considered:
​
Take the current house's money: If the current house i is robbed, the total amount would be the sum of the money in house i (nums[i]) and the maximum amount robbed up to house i-2 (dp[i-2]). This is because adjacent houses cannot be robbed, so the previous house (i-1) must be skipped. However, if i is 1, there is no i-2, so the amount is simply nums[i].
Leave the current house: If the current house is not robbed, the total amount is simply the maximum amount robbed up to the previous house (dp[i-1]).
For each house i, the algorithm stores the maximum of these two choices in dp[i]. This ensures that the best possible outcome is calculated at each step.
​
After the loop completes, the program returns dp[n-1], which holds the maximum amount of money that can be robbed from all the houses.
​
The time complexity of this solution is O(n), as it iterates through the list of houses once. The space complexity is also O(n), due to the dp array storing the maximum money that can be robbed for each house up to n.
​
​