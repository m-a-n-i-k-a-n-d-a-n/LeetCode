class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> m=new HashMap();
        int d;
        for(int i=0;i<nums.length;i++)
        {
            d=target-nums[i];
            if(m.containsKey(d))
            {
                return new int[]{m.get(d),i};
            }
            m.put(nums[i],i);
        }
        return null;
    }
}