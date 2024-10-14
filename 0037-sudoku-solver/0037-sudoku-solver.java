class Solution {
    public static boolean isValid(char[][] board, int row, int col, char c){
        
        for(int i=0;i<9;i++){
            //check in row
            if(board[row][i]==c) return false;
            //check in column
            if(board[i][col]==c) return false;
            //check in sub boxes of the grid
            //starting row of current box will be 3*(row/3)
            //adding with i/3 will give current row
            //similarly we will get current column
            //but we will add i%3 this time
            if(board[3*(row/3)+(i/3)][3*(col/3)+(i%3)]==c) return false;
        }
        return true;
    }
    public boolean solveSudoku(char[][] board) {
        //iterate for each box in the grid
        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                if(board[row][col]=='.'){
                    //check for all values vetween 1 to 9
                    for(char c='1';c<='9';c++){
                        //check if the value is valid
                        if(isValid(board,row,col,c)){
                            board[row][col]=c;
                            //put the value in the box and check if
                            //that value gives correct solution for board
                            if(solveSudoku(board)){
                                //we return true and stop iterating for
                                //valid values
                                return true;
                            }else{
                                //if it doesn't solve the board put '.'
                                //in the box, we will keep iterating
                                //for valid values
                                board[row][col]='.';
                            }
                        }
                    }
                    //if nothing between 1-9 give the solution, we return false
                    return false;
                }
            }
        }
        return true;
    }
}