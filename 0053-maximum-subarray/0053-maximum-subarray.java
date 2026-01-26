class Solution {
    public int maxSubArray(int[] nums) {
    //as problem array have atleast one element then not need to think about empty array
    //[1,-2,3]--> default first ans =1and bestend =1-->
       int bestend= nums[0];
       int ans = nums[0];
      for(int i=1;i<nums.length;i++){
        int a= nums[i]+bestend;
        int b=nums[i];
        bestend = Math.max(a,b);
        ans = Math.max(bestend,ans);
      }
        return ans; 
    }
}