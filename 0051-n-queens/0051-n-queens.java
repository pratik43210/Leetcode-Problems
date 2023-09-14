class Solution {
    private boolean isSafe(char[][] board, int row, int col){
        
        for(int r=row,c=col;r>=0 && c>=0;r--,c--){
            if(board[r][c]=='Q') return false;
        }
        
        for(int c=col;c>=0;c--){
            if(board[row][c]=='Q') return false;
        }
        
        for(int r=row,c=col;c>=0 && r<board.length;c--,r++){
            if(board[r][c]=='Q') return false;
        }
        
        return true;
    }
    
    private void saveBoard(char[][] board, List<List<String>> allBoards){
        String row="";
        List<String> boardEl=new ArrayList<>();
        
        for(int r=0;r<board.length;r++){
            row="";
            for(int c=0;c<board[0].length;c++){
                if(board[r][c]=='Q') row+='Q';
                else row+='.';
            }
            boardEl.add(row);
        }
        allBoards.add(boardEl);
    }
    
    private void helper(char[][] board, List<List<String>> allBoards,int col){
        if(col==board.length){
            saveBoard(board, allBoards);
            return;
        }
        
        for(int row=0;row<board.length;row++){
            if(isSafe(board, row, col)){
                board[row][col]='Q';
                helper(board, allBoards,col+1);
                board[row][col]='.';
            }
            
        }
    }
    
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards=new ArrayList<>();
        char[][] board=new char[n][n];
        helper(board,allBoards,0);
        return allBoards;
    }
}