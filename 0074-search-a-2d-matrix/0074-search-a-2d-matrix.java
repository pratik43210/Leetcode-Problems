class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
//         int rows=matrix.length;
//         int cols=matrix[0].length;
        
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<cols;j++){
//                 if(matrix[i][j]==target){
//                     return true;
//                 }
//             }
//         }
        
//         return false;
        
        //m2 using binary search and treating matrix as 1D array
        
        //flatten the 2-D matrix;
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