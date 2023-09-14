class Solution {
    private boolean isValid(char[][] board, int row, int col, char c){
        for(int i=0;i<board.length;i++){
            if(board[i][col]==c) return false;
            if(board[row][i]==c) return false;
            if(board[(row/3)*3+i/3][(col/3)*3+i%3]==c) return false;
        }
        return true;
    }
    
    // public boolean solveSudoku(char[][] board) {
    //     for(int i=0;i<board.length;i++){
    //         for(int j=0;j<board[0].length;j++){
    //             if(board[i][j]=='.'){
    //                 for(char c='1';c<='9';c++){
    //                     if(isValid(board,i,j,c)){
    //                         board[i][j]=c;
    //                         if(solveSudoku(board)) return true;
    //                         else board[i][j]='.';
    //                     }
    //                 }
    //                 return false;
    //             }
    //         }
    //     }
    //     return true;
    // }
    
    private boolean solve(char[][] board, int row, int col){
        if(row==board.length) return true;
        
        int nrow=0,ncol=0;
        
        if(col!=board[0].length-1){
            nrow=row;
            ncol=col+1;
        }else{
            nrow=row+1;
            ncol=0;
        }
        
        if(board[row][col]!='.'){
            if(solve(board,nrow,ncol)) return true;
        }else{
            for(char c='1';c<='9';c++){
                if(isValid(board,row,col,c)){
                    board[row][col]=c;
                    if(solve(board,nrow,ncol)) return true;
                    else board[row][col]='.';
                }
            }
        }
        
        return false;
    }
    
    public void solveSudoku(char[][] board){
        solve(board,0,0);
    }
}