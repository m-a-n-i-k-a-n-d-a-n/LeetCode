class Solution {
public:
    bool canJump(vector<int>& nums) {
        int n=nums.size();
        int maxInd=0;
        for(int i=0;i<n;i++)
        {
            maxInd=max(maxInd,nums[i]+i);
            if(maxInd>=n-1)
            {
                return true;
            }
            if(i>=maxInd)
            {
                return false;
            }
        }
        return false;
    }
};