int[][] dp=new int[m][n];
for(int i=0;i<m;i++){
for(int j=0;j<n;j++){
dp[i][j]=-1;
}
}
return countPaths(0,0,m,n,dp);
}
}
​
**Explanation**
This solution solves the problem of finding the number of unique paths in an m x n grid using dynamic programming with memoization. Here’s a breakdown of how it works:
​
**Functionality**
1.countPaths(i, j, m, n, dp):
​
This is a recursive function that computes the number of unique paths starting from cell (i, j) to the bottom-right cell (m-1, n-1).
*   Base Cases:
* If the current cell is the bottom-right corner (i == m-1 && j == n-1), return 1, because there's exactly one way to be at the destination.
* If the current cell is out of bounds (i >= m || j >= n), return 0, since this isn't a valid path.
*   Memoization:
* If the result for the current cell (i, j) is already computed and stored in dp[i][j], return that value to avoid redundant calculations.
*   Recursive Calculation:
* The function recursively computes the number of paths from (i+1, j) (moving down) and (i, j+1) (moving right) and sums them. This value is then stored in dp[i][j].
2.uniquePaths(m, n):
​
*       Initializes a 2D array dp of size m x n, where each entry is set to -1 (indicating that no result has been computed for that cell yet).
*       Calls the countPaths function starting from the top-left corner (0, 0) to calculate the total number of unique paths.
*
**Complexity**
* Time Complexity:
The time complexity of the solution is O(m * n) because each cell in the dp array is computed only once.
* Space Complexity:
The space complexity is O(m * n) due to the dp array and recursion stack space.