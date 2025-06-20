class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int pre=1,post=1;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            res[i]=pre;
            pre=pre*nums[i];
        }
        for(int j=n-1;j>=0;j--)
        {
            res[j]=res[j]*post;
            post=post*nums[j];
        }
        return res;
    }
}