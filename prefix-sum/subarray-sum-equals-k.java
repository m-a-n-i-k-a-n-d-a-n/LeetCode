class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum=0,c=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int ele:nums) {
            sum=sum+ele;
            if(map.containsKey(sum-k)) 
                c=c+map.get(sum-k);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return c;
    }
}