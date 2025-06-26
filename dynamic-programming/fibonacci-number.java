class Solution {
    public int fib(int n) {
        if(n<=1)
            return n;
        int l=0,r=1;
        int sum=0;
        for(int i=2;i<=n;i++) {
            sum=l+r;
            l=r;
            r=sum;
        }
        return sum;
    }
}