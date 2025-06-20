class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] lh=new int[n];
        int[] rh=new int[n];
        int area=0;
        for(int i=0;i<n;i++)
        {
            if(i==0) lh[i]=height[i];
            else
            lh[i]=Math.max(lh[i-1],height[i]);
        }
        for(int i=n-1;i>=0;i--)
        {
            if(i==n-1) rh[i]=height[i];
            else
            rh[i]=Math.max(rh[i+1],height[i]);
        }
        for(int i=0;i<n;i++)
            area=area+(Math.min(lh[i],rh[i])-height[i]);
        return area;
    }
    
}