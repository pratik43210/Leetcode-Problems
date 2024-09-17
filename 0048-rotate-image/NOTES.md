class Solution {
public void rotate(int[][] matrix) {
int n=matrix.length;
for(int i=0;i<n-1;i++){
for(int j=i+1;j<n;j++){
int temp=matrix[i][j];
matrix[i][j]=matrix[j][i];
matrix[j][i]=temp;
}
}
for(int i=0;i<n;i++){
for(int j=0;j<n/2;j++){
int temp=matrix[i][j];
matrix[i][j]=matrix[i][n-1-j];
matrix[i][n-1-j]=temp;
}
}
}
}
​
**Explanation of the Code: Rotate a Matrix by 90 Degrees (Clockwise)**
This problem requires rotating a 2D matrix by 90 degrees in the clockwise direction in-place. The matrix is an n x n 2D array.
​
**Approach**
The key idea to rotate the matrix by 90 degrees is to break the problem into two simpler steps:
​
**Transpose the matrix*:* Convert rows into columns by swapping matrix[i][j] with matrix[j][i].
**Reverse each row:** After the transpose, reverse every row to achieve the 90-degree clockwise rotation.
​
**Step-by-Step Breakdown**
**1. Transpose the Matrix:**
The transpose of a matrix involves flipping the matrix over its diagonal (i.e., swapping elements matrix[i][j] and matrix[j][i] for i ≠ j).
**2. Reverse Each Row:**
After transposing the matrix, the next step is to reverse each row to get the final rotated matrix.