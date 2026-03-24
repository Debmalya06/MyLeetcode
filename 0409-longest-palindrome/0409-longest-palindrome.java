import java.util.*;

class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: count frequency
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int count = 0;
        boolean hasOdd = false;

        // Step 2: iterate
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            int freq = entry.getValue();

            if(freq % 2 == 0) {
                count += freq;
            } else {
                count += freq - 1;
                hasOdd = true;
            }
        }

        // Step 3: add center character if any odd exists
        if(hasOdd) count += 1;

        return count;
    }
}