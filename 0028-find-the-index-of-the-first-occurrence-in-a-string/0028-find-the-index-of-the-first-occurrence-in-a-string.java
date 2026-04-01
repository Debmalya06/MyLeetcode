class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        int i=0,j=0;//j-->haystack i--> needle
       while(i<needle.length() && j<haystack.length()){
        if(needle.charAt(i)==haystack.charAt(j)) {
            i++;
            j++;
              if(i==needle.length()) return j-i;
        }
        else{
            j=j-i+1;
            i=0;
            
        }
       }
       return -1;
    }
}