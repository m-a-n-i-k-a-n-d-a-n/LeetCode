class Solution {
    public String intToRoman(int num) {
         String ans="";
        String[] rom={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] no={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        for(int pos=0;num>0;++pos)
        {
            while(num>=no[pos])
            {
                ans=ans+rom[pos];
                num=num-no[pos];
            }
        }
        return ans;
    }
}