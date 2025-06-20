class Solution {
    public String baseNeg2(int n) {
        if(n==0) return "0";
        int r;
        StringBuilder s=new StringBuilder();
        while(n!=0)
        {
            r=n%-2;
            if(r<0)
            {
                r=r+2;
                n=(n/-2)+1;
            }
            else n=n/-2;
            s.append(Integer.toString(r));
        }
        return s.reverse().toString();
    }
}