class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int low =0, res=0; 
        for(int high=0;high<s.length();high++){
            arr[s.charAt(high) - 'A']++;
            int len = high-low+1;
            int maxint = found(arr);
            int diff = len -maxint;
            while(diff>k){
            arr[s.charAt(low) - 'A']--;
                low++;
                 maxint = found(arr);
                 len = high - low + 1;
                 diff = len -maxint;
            }
            len = high-low+1;
            res = Math.max(res, len);
        }
        return res;

    }
    public int found(int[] arr){
        int maxc=-1;
        for(int i=0;i<26;i++){
            maxc = Math.max(maxc, arr[i]);
        }
        return maxc;
    }
}