class Solution {
public:
    int tribonacci(int n) {
        int a=0,b=1,c=1;
        int s;
        for(int i=3;i<=n;i++)
        {
            s=a+b+c;
            a=b;
            b=c;
            c=s;
        }
        return s;
    }
};