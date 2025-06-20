class Solution {
    public int romanToInt(String s) {
    HashMap<Character,Integer> m = new HashMap();
    int no=0,i;
    m.put('I',1);
    m.put('V',5);
    m.put('X',10);
    m.put('L',50);
    m.put('C',100);
    m.put('D',500);
    m.put('M',1000);
    for(i=0;i<s.length()-1;i++)
    {
        if(m.get(s.charAt(i))>=m.get(s.charAt(i+1)))
            no=no+m.get(s.charAt(i));
        else
            no=no-m.get(s.charAt(i));
    }
    return no+m.get(s.charAt(i));
    }
}