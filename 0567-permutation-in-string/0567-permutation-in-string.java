class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int arr[]= new int[128];
        int count =s1.length();
        int low =0;
        for(char c:s1.toCharArray()) arr[c]++;
        for(int high=0;high<s2.length();high++)
        {
            if(arr[s2.charAt(high)]>0){
                count--;
            }
            arr[s2.charAt(high)]--;
            // when window size exceeds s1 length
            if (high - low + 1 > s1.length()) {
                if (arr[s2.charAt(low)] >=0) {
                    count++;
                }
                
                arr[s2.charAt(low)]++;
                low++;
            }

            if(count==0) return true;

        }
        return false;
    }
}