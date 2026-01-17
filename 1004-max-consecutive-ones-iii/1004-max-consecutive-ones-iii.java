class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans=0, sum =0, i=0, j=0;
        while(j<nums.length){
            sum += nums[j];// base calculation
            // j increment will add last.
            // silde window -->
            while( sum+k<j-i+1){
                sum -= nums[i];
                i++;
            } 
            //answer -->
            ans = Math.max(ans, j-i+1);
            j++;

        }
        return ans;
    }
}