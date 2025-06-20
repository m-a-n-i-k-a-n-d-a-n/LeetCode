class Solution {
    public String largestNumber(int[] nums) {
        String[] s=new String[nums.length];
        for(int i=0;i<nums.length;i++)
            s[i]=Integer.toString(nums[i]);
        Arrays.sort(s,(a,b)->(b+a).compareTo(a+b));
        StringBuilder ans=new StringBuilder();
        if(s[0].equals("0"))
            return "0";
        for(String ele : s)
            ans.append(ele);
        return ans.toString();
    }
}