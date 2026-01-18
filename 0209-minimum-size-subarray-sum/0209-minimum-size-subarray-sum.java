class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0, res=Integer.MAX_VALUE, low=0;
        for(int high=0;high<nums.length;high++){
            sum+=nums[high];
            while(sum>=target){
                res=Math.min(res, (high-low+1));
                sum=sum-nums[low];
                low++;
            }
        }
    
        return res==Integer.MAX_VALUE?0:res;
    }
}