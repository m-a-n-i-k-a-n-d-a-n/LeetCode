class Solution {
    public boolean isAnagram(String s, String t) {
        int l1=s.length();
        int l2=s.length();
        char ch1[] = s.toCharArray();
        char ch2[] = t.toCharArray();
        if(l1!=l2) return false;
        else
        {
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            String a=new String(ch1);
            String b=new String(ch2);
            if(a.equals(b)) return true;
            else return false;
        }
    }
}