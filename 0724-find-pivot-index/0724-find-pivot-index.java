class Solution {
    public int pivotIndex(int[] nums) {
        int left=0,sum=0, right=0;
        for(int n:nums){
            sum+=n;
        }
        if(sum-nums[0]==0) return 0; 
        for(int i=1;i<nums.length;i++){
            left+=nums[i-1];
            right=sum-left-nums[i];
            if(right==left) return i;
        }
        return -1;
    }
}