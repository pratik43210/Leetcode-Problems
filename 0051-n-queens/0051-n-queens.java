class Solution {
    private static boolean isSafe(char[][] board, int row, int col){
        //we will check for previous columns only as there's
        //no queen in right when this function is called
        
        //check for queen in previous columns in the same row
        for(int c=col;c>=0;c--){
            if(board[row][c]=='Q') return false;
        }
        
        //check in upper diagonal for previous columns
        for(int c=col,r=row;c>=0 && r>=0;c--,r--){
            if(board[r][c]=='Q') return false;
        }
        
        //check in lower diagonal for previous columns
        for(int c=col,r=row;c>=0 && r<board.length;c--,r++){
            if(board[r][c]=='Q') return false;
        }
        
        return true;
    }
    private static void saveBoard(char[][] board, List<List<String>> allBoards){
        List<String> boardEl=new ArrayList<>();
        //baordEl contains list of row strings for current board
        for(int r=0;r<board.length;r++){
            String row="";
            //create row string
            for(int c=0;c<board[0].length;c++){
                if(board[r][c]=='Q') row+='Q';
                else row+='.';
            }
            //add row string to boardEl
            boardEl.add(row);
        }
        //add current board (in List<string> form) in 
        //allBoards (List<List<String>> form)
        allBoards.add(boardEl);
    }
    private static void helper(char[][] board, List<List<String>> allBoards, int col){
        //if we have completed till last column, that means we have
        //found a solution, so we add the current board to allBoards
        if(col==board[0].length){
            saveBoard(board,allBoards);
            //we add return here because rest of code in function
            //is not checking for column so there will be error
            return;
        }
        
        //loop through rows in current column
        for(int row=0;row<board.length;row++){
            if(isSafe(board,row,col)){
                //if current position is safe put 'Q'
                board[row][col]='Q';
                //move to fill next column
                helper(board,allBoards,col+1);
                //when we backtrack, remove 'Q' 
                board[row][col]='.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        //this will store the answer
        List<List<String>> allBoards=new ArrayList<>();
        //this array will act as our board
        char[][] board=new char[n][n];
        //call helper function to solve
        helper(board,allBoards,0);
        //return result
        return allBoards;
    }
}