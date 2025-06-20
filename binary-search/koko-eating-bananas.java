class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=piles[0];
        for(int i=0;i<piles.length;i++)
        {
            if(max<piles[i]) max=piles[i];
        }
        int l=1,r=max,mid,hour,d;
        while(l<r)
        {
            mid=(l+r)/2;
            hour=0;
            for(int i=0;i<piles.length;i++)
            {
                d=piles[i]/mid;
                if(piles[i]%mid!=0) d=d+1;
                hour=hour+d;
            }
            if(h>=hour) r=mid;
            else l=mid+1; 
        }
        return l;
    }
}