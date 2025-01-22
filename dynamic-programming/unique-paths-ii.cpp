class Solution {
public:
    int solve(int i,int j,int m,int n,vector<vector<int>>& og,vector<vector<int>> &dp)
    {
        if(i>=m || j>=n) return 0;
        if(og[i][j]==1) return 0;
        if(i==m-1 && j==n-1) return 1;
        if(dp[i][j]!=-1) return dp[i][j];
        else return dp[i][j]=solve(i+1,j,m,n,og,dp)+solve(i,j+1,m,n,og,dp);
    }
    int uniquePathsWithObstacles(vector<vector<int>>& og) {
        int m=og.size();
        int n=og[0].size();
        vector<vector<int>> dp(m+1,vector<int>(n+1,-1));
        return solve(0,0,m,n,og,dp);
    }
};