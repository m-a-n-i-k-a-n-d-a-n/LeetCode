class Solution {
    public int findMin(int[] nums) {
        int l=0,mid;
        int n=nums.length;
        int r=n-1;
        if(nums[l]<nums[r]) return nums[l];
        while(l<=r)
        {
            mid=(l+r)/2;
            if(nums[mid]>nums[n-1]) l=mid+1;
            else r=mid-1;
        }
        return nums[l];
    }
}