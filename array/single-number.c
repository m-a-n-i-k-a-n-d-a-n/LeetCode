int singleNumber(int* nums, int n) {
        int i,res=0;
        for(i=0;i<n;i++)
        {
            res=res^nums[i];
        }
        return res;
}