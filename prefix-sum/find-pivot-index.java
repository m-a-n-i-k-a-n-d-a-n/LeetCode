class Solution {
    public int pivotIndex(int[] nums) {
        int l=0,r=nums.length-1;
        while(l<r) {
            int mid=(l+r)/2;
            int lsum=0,rsum=0;
            for(int i=0;i<mid;i++)
                lsum=lsum+nums[i];
            for(int i=mid+1;i<nums.length;i++)
                rsum=rsum+nums[i];
            if(lsum==rsum)
                return mid;
            else if(lsum>rsum)
                r--;
            else
                l++;
        }
        return -1;
    }
}