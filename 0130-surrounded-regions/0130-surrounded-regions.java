class Solution
{
      public void solve(char[][] board) 
      {
        int m = board.length;
        int n = board[0].length;

        // traverse 1st and last col
        for (int i = 0; i < m; i++){
            dfs(board, i, 0);
            dfs(board, i, n - 1);
        }

        // traverse 1st and last row
        for (int j = 0; j < n; j++){
            dfs(board, 0, j);
            dfs(board, m - 1, j);
        }

        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (board[i][j] == 'O')
                {
                    board[i][j] = 'X';
                }
                if (board[i][j] == '*')
                {
                    board[i][j] = 'O';
                }
            }
        }
    }

    public void dfs(char[][] board, int i, int j){
        if (i < 0 || j < 0 || i >= board.length || j >= board[i].length){
            return;
        }

        if (board[i][j] == 'X' || board[i][j] == '*'){
            return;
        }

        board[i][j] = '*';
        dfs(board, i + 1, j);
        dfs(board, i - 1, j);
        dfs(board, i, j + 1);
        dfs(board, i, j - 1);
    }
    
}
