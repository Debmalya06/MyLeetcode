class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) return "";

        int[] freq = new int[128];
        for (char c : t.toCharArray()) freq[c]++;

        int low = 0, count = t.length();
        int minLen = Integer.MAX_VALUE, start = 0;

        for (int high = 0; high < s.length(); high++) {

            if (freq[s.charAt(high)] > 0) count--;
            freq[s.charAt(high)]--;

            while (count == 0) {
                if (high - low + 1 < minLen) {
                    minLen = high - low + 1;
                    start = low;
                }

                freq[s.charAt(low)]++;
                if (freq[s.charAt(low)] > 0) count++;
                low++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
