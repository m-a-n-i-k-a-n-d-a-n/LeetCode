class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length+1];
        Arrays.fill(dp,-1);
        int res=find(nums,nums.length-1,dp);
        return res;
    }
    static int find(int nums[],int i,int dp[]) {
        if(i<0)
            return 0;
        if(dp[i]>=0)
            return dp[i];
        int res=Math.max(find(nums,i-2,dp)+nums[i],find(nums,i-1,dp));
        dp[i]=res;
        return res;
    }
}