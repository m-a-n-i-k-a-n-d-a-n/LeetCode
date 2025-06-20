class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> l=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            int a=Math.abs(nums[i])-1;
            if(nums[a]>0)
                nums[a]=nums[a]*-1;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
                l.add(i+1);
        }
        return l;
    }
}