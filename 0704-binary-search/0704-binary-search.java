class Solution {
    public int search(int[] nums, int target) {
      return  findindex(0,nums.length-1,target,nums);
    }
    public int findindex(int l, int h, int tar, int[] nums){
        while(l<=h){
           int mid = l + (h - l) / 2;
            if(nums[mid]==tar) return mid;
            else if(nums[mid]>tar) h=mid-1;
            else if(nums[mid]<tar) l=mid+1;
        }
        return -1;
    }
}