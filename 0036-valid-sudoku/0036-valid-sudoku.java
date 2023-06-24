class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String>st=new HashSet<>();
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                char temp=board[i][j];
                if(temp!='.')
                {
                    if(!st.add(temp+" at row "+i) || !st.add(temp+" at column "+j) || !st.add(temp+" at box "+i/3+" "+j/3))
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}