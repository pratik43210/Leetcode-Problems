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
​
**Optimum solution**
class Solution {
public int uniquePaths(int m, int n) {
int N = m+n-2;
int r= m-1;
double res=1;
for(int i=1;i<=r;i++){
//goes from N-r to N
res=res*(N-r+i)/i;
}
return (int)res;
}
}
​
**Approach**
This problem can be solved using combinatorics. The total number of moves needed to go from the top-left to the bottom-right is a combination of m-1 down moves and n-1 right moves, which is a total of m+n-2 moves. The number of ways to choose m-1 down moves (or equivalently n-1 right moves) from m+n-2 moves is computed using binomial coefficients.
​
N = m + n - 2: The total number of moves.
r = m - 1: The number of down moves.
​
**Tabulation Approach(dp)**
​
class Solution {
public int uniquePaths(int m, int n) {
int[][] dp=new int[m][n];
dp[0][0]=1;
for(int i=0;i<m;i++){
for(int j=0;j<n;j++){
if (i == 0 && j == 0) {
dp[i][j] = 1;
continue;
}
int up=0,left=0;
if(i>0){
up=dp[i-1][j];
}
if(j>0){
left=dp[i][j-1];
}