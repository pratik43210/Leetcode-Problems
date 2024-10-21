if (i == 0 && j == 0 && obstacleGrid[i][j]==1) {
temp[j] = 0;
continue;
}
if(i == 0 && j == 0){
temp[j]=1;
continue;
}
int up=0,left=0;
if(i>0 && obstacleGrid[i][j]!=1){
up=prev[j];
}
if(j>0 && obstacleGrid[i][j]!=1){
left=temp[j-1];
}
temp[j]=up+left;
}
prev=temp;
}
return prev[n-1];
}
}
​
**Explanation**
​
In the first solution, the problem involves finding the number of unique paths in a grid where some cells may have obstacles. The tabulation dynamic programming (DP) approach builds a 2D array dp[m][n] where m is the number of rows and n is the number of columns in the grid. The cell dp[i][j] stores the number of unique ways to reach cell (i, j) from the starting point at (0, 0).
​
Initially, the algorithm checks if the starting cell contains an obstacle. If it does, it immediately sets dp[0][0] to 0, as no paths are possible, and then continues with the rest of the grid. If the starting cell is not blocked, dp[0][0] is set to 1 because there is exactly one way to be at the start: simply starting there.
​
For each subsequent cell (i, j), the number of unique ways to reach it is the sum of the paths from the cell directly above (dp[i-1][j]) and the cell to the left (dp[i][j-1]). However, if a cell contains an obstacle (represented by a 1 in obstacleGrid), the number of ways to reach that cell is set to 0. The algorithm handles boundary conditions by ensuring that cells on the top row or the left column are correctly processed without accessing invalid array indices. Finally, the number of unique paths to reach the bottom-right corner is stored in dp[m-1][n-1].
​
The time complexity of this solution is O(m * n) because every cell in the grid is processed once. The space complexity is also O(m * n), as it stores an additional 2D array dp of the same size as the grid.
​
The second solution optimizes the space complexity by reducing the 2D DP array to two 1D arrays, prev and temp. The prev array stores the number of ways to reach cells in the previous row, while temp stores the current row being processed. The logic remains similar: for each cell (i, j), if it contains an obstacle, it sets temp[j] to 0. Otherwise, the value of temp[j] is the sum of the values from the cell directly above (stored in prev[j]) and the cell to the left (stored in temp[j-1]). After processing each row, prev is updated to be temp for the next row. The final answer is stored in prev[n-1], which represents the number of ways to reach the bottom-right corner.
​
This space optimization reduces the space complexity to O(n), as only two arrays of size n are needed. The time complexity remains O(m * n), as every cell is still processed once.
​