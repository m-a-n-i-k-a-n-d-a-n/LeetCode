void reverse(int start,int end,int *nums)
{
    int temp;
    while(start<end)
    {
        temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
        start++;
        end--;
    }
}
void rotate(int* nums, int numsSize, int k) {
        k=k%numsSize;
        reverse(0,numsSize-k-1,nums);
        reverse(numsSize-k,numsSize-1,nums);
        reverse(0,numsSize-1,nums);
    for(int i=0;i<numsSize;i++)
        printf("%d ",nums[i]);
}