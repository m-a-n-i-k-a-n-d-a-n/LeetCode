class Solution {
    int emp=1,res=0;
    public int uniquePathsIII(int[][] grid) {
        int x=0,y=0;
        int n=grid.length,m=grid[0].length;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(grid[i][j]==0)
                    emp+=1;
                else if(grid[i][j]==1) {
                    x=i;
                    y=j;
                }
            }
        }
        findPath(grid,x,y,0);
        return res;
    }
    private void findPath(int[][] grid,int i,int j,int count) {
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==-1)
            return;
        if(grid[i][j]==2) {
            if(count==emp)
                res++;
            return;
        }
        int temp=grid[i][j];
        grid[i][j]=-1;
        
        findPath(grid,i-1,j,count+1);
        findPath(grid,i+1,j,count+1);
        findPath(grid,i,j-1,count+1);
        findPath(grid,i,j+1,count+1);
        
        grid[i][j]=temp;
    }
}