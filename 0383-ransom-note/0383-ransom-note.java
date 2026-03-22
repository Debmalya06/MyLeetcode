class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();

        // count ransomNote chars
        for(char c : ransomNote.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // reduce using magazine
        for(char c : magazine.toCharArray()) {
            if(map.containsKey(c)) {
                if(map.get(c) > 1) {
                    map.put(c, map.get(c) - 1);
                } else {
                    map.remove(c);
                }
            }
        }

        return map.isEmpty(); 
    }
}