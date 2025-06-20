class Solution {
    public String convertToBase7(int num) {
        if(num==0) return "0";
        int r,sum=0,n=num;
        StringBuilder s=new StringBuilder();
        while(num!=0)
        {
            r=num%7;
            num=num/7;
            s.append(Integer.toString(Math.abs(r)));
        }
        if(n<0) s.append('-');
        s.reverse();
        return s.toString();
    }
}