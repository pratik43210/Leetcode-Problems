class Solution {
public boolean searchMatrix(int[][] matrix, int target) {
​
int m=matrix.length;
int n=matrix[0].length;
int low=0, high=m*n-1;
while(low<=high){
int mid=(low+high)/2;;
int ri=mid/n;
int ci=mid%n;
if(matrix[ri][ci]==target) return true;
else if(matrix[ri][ci]<target) low=mid+1;
else high=mid-1;
}
return false;
}
}
**Explanation of the Code: Searching in a 2D Matrix**
This problem involves searching for a target value in a 2D matrix. The matrix has the following properties:
​
Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
The goal is to determine if the target value exists in the matrix.
​
**Approach: Binary Search**
We can treat the 2D matrix as a 1D array for the purpose of applying binary search. The matrix is sorted both row-wise and column-wise, so we can use binary search to efficiently find the target.
​
We calculate mid, the middle index of the current search range.
We convert mid back to 2D matrix coordinates using mid / n (row index) and mid % n (column index).
If the element at matrix[ri][ci] equals the target, we return true.
If the element is less than the target, we discard the lower half of the current range by setting low = mid + 1.
If the element is greater than the target, we discard the upper half by setting high = mid - 1.
​
This solution efficiently searches for a target in a 2D matrix by performing binary search, treating the matrix as a 1D array, with a time complexity of O(log(m * n)).