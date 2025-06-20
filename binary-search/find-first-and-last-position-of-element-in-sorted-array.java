class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=0,r=nums.length-1,mid;
        int[] res={-1,-1};
        while(l<=r)
        {
            mid=(l+r)/2;
            if(nums[mid]>=target) r=mid-1;
            else l=mid+1;
        }
        if(l>=nums.length || nums[l]!=target) return res;
        else res[0]=l;
        r=nums.length-1;
        while(l<=r)
        {
            mid=(l+r)/2;
            if(nums[mid]>target) r=mid - 1;
            else l=mid+1;
        }
        res[1]=r;
        return res;
    }
}