class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        String w = words[words.length - 1];
        return w.length();
    }
}