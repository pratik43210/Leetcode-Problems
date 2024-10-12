if(board[r][c]=='Q') row+='Q';
else row+='.';
}
boardEl.add(row);
}
allBoards.add(boardEl);
}
private static void helper(char[][] board, List<List<String>> allBoards, int col){
if(col==board[0].length){
saveBoard(board,allBoards);
return;
}
for(int row=0;row<board.length;row++){
if(isSafe(board,row,col)){
board[row][col]='Q';
helper(board,allBoards,col+1);
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
​
**Explanation**
​
​