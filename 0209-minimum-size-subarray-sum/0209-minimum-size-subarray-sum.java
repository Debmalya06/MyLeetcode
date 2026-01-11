class Solution {
    public int minSubArrayLen(int k, int[] nums) {
       int sum = 0, res=Integer.MAX_VALUE;
       int i=0,j=0;
       while(j<nums.length){
        sum+=nums[j];
        while(sum>=k){
            int len = j-i+1;
            res=Math.min(res,len);
            sum=sum-nums[i];
            i++;
        }
        j++;
       }
       
       if(res==Integer.MAX_VALUE) return 0;
       else return res;
    }
}
