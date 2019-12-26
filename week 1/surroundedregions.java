class Solution {
    public void solve(char[][] board) {
        if(board.length == 0){
            return;
        }
     for(int i = 0; i < board[0].length; i++){
         if(board[0][i] == 'O'){
             mazeTraverse(board,0,i);
         } 
     }
     for(int i = 0; i < board.length; i++){
         if(board[i][(board[0].length)-1] == 'O'){
             mazeTraverse(board,i,(board[0].length)-1);
         }
     }  
     for(int i = 0; i < board[0].length; i++){
         if(board[(board.length)-1][i] == 'O'){
             mazeTraverse(board,(board.length)-1,i);
         }
     }
        
     for(int i = 0; i < board.length; i++){
         if(board[i][0] == 'O'){
             mazeTraverse(board,i,0);
         }
     }
        
    for(int i = 0; i < board.length; i++){
        for(int j = 0; j < board[i].length; j++){
            if(board[i][j] == 'O'){
                board[i][j] = 'X';
            }if(board[i][j] == 'V'){
                board[i][j] = 'O';
            }
        }
    } 
}
    public void mazeTraverse(char [] [] board,int i, int j){
        if(i < 0 || i >= board.length) return;
        if(j < 0 || j >= board[0].length) return;
        if(board[i][j] == 'X' || board[i][j] == 'V') return;
        board[i][j] = 'V';
        mazeTraverse(board, i + 1, j);
        mazeTraverse(board, i - 1, j);
        mazeTraverse(board, i, j + 1);
        mazeTraverse(board, i, j - 1);
    }
}