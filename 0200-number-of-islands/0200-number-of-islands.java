class Solution {
    private int n,m;
    private void mark_islands(char grid[][],int i,int j)
    {
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]!='1')
        {
            return;
        }
        grid[i][j]='*';
        mark_islands(grid,i+1,j);
        mark_islands(grid,i,j+1);
        mark_islands(grid,i-1,j);
        mark_islands(grid,i,j-1);
    }
    public int numIslands(char[][] grid) {
        n=grid.length;
        m=grid[0].length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='1')
                {
                    count++;
                    mark_islands(grid,i,j);
                }
            }
        }
        return count;
    }
}