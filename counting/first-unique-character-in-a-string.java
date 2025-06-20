class Solution {
    public int firstUniqChar(String s) {
        int i,j,res=0;
        int c;
        char[] ch=s.toCharArray();
        for(i=0;i<ch.length;i++)
        {
            for(j=0;j<ch.length;j++)
            {
                if(i!=j && ch[i]==ch[j])
                {
                    break;
                }
                if(j==ch.length-1)
                {
                    return i;
                }
            }
        }
    return -1;
    }
}