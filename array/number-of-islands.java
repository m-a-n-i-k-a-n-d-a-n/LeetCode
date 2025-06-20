class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='1')
                {
                    count++;
                    neighbour(grid,i,j);
                }
            }
        }
        return count;
    }
    public void neighbour(char[][] grid,int i,int j)
    {
        int n=grid.length;
        int m=grid[0].length;
        if(i<0 || j<0)
            return;
        if(i>=n || j>=m)
            return;
        if(grid[i][j]=='0')
            return;
        grid[i][j]='0';

        neighbour(grid,i-1,j);
        neighbour(grid,i+1,j);
        neighbour(grid,i,j-1);
        neighbour(grid,i,j+1);
    }
}