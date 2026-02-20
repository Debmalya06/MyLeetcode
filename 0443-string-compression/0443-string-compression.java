class Solution {
    public int compress(char[] chars) {
    
      int index = 0;
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            int count = 0;
            while (i < chars.length && chars[i] == ch) {
                count++;
                i++;
            }
            i--; // decrement i because it will be incremented in the for loop
            chars[index++] = ch;
            if (count > 1) {
                String st = Integer.toString(count);
                for (char d : st.toCharArray()) {
                    chars[index++] = d;
                }
            }
        }
        // System.out.println(index);
return index;
    }
}