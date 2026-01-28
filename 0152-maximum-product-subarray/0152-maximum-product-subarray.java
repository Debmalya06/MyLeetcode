class Solution {
    public int maxProduct(int[] nums) {
        int maxEnd = nums[0];
        int minEnd = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int self = nums[i];
            int maxelement = maxEnd*nums[i];
            int minelement = minEnd* nums[i];
            maxEnd = Math.max(self, Math.max(minelement,maxelement));
            minEnd = Math.min(self, Math.min(minelement,maxelement));

            ans = Math.max(ans, Math.max(maxEnd,minEnd));
        }
        return ans;
    }
}
