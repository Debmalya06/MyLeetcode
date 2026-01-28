class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxend = nums[0];
        int minend = nums[0];
        int ans =Math.abs(nums[0]);
        for(int i=1;i<nums.length;i++){

            int self=nums[i];
            maxend = Math.max(self,nums[i]+maxend);
            minend = Math.min(self,nums[i]+minend);
            ans = Math.max(ans, Math.max(maxend, Math.abs(minend)));
        }
        return ans;
    }
}