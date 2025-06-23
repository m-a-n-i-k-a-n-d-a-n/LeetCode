class Solution {
    public int pivotIndex(int[] nums) {
        int lsum=0,rsum=0,totsum=0;
        for(int i=0;i<nums.length;i++)
            totsum+=nums[i];
        for(int i=0;i<nums.length;i++) {
            if(i!=0)
                lsum+=nums[i-1];
            rsum=totsum-lsum-nums[i];
            if(lsum==rsum)
                return i;
        }
        return -1;
    }
}