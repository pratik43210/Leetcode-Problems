**Tabulation**
​
​
**Tabulation+space optimization**
​
class Solution {
public int uniquePathsWithObstacles(int[][] obstacleGrid) {
int m=obstacleGrid.length;
int n=obstacleGrid[0].length;
int[] prev=new int[m];
for(int i=0;i<m;i++){
int[] temp=new int[n];
for(int j=0;j<n;j++){
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