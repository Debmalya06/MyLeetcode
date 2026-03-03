class Solution {
    public int lengthOfLastWord(String s) {
        String[] sp = s.split(" ");
       int  LenIndex = sp.length-1;
       int LastWordLen = sp[LenIndex].length();
       return LastWordLen;
    }
    
}
