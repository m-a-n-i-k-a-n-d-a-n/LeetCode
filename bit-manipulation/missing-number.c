int missingNumber(int* nums, int n) {
    int s=0,v=0;
    for(int i=0;i<n;i++)
        s=s+nums[i];
    for(int i=0;i<=n;i++)
        v=v+i;
    return v-s;
}