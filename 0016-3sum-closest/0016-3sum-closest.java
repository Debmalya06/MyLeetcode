class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);

        int res = nums[0] + nums[1] + nums[2];

        for(int i = 0; i < nums.length - 2; i++) {

            int l = i + 1;
            int r = nums.length - 1;

            while(l < r) {

                int s = nums[i] + nums[l] + nums[r];

                if(Math.abs(s - target) < Math.abs(res - target)) {
                    res = s;
                }

                if(s < target) {
                    l++;
                }
                else if(s > target) {
                    r--;
                }
                else {
                    return s;
                }
            }
        }

        return res;
    }
}