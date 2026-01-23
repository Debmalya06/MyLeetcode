class Solution {
    public int findDuplicate(int[] nums) {
        int s=0;
            int f=0;

        while(true){
          s=nums[s];
          //fast will increase two times.
          f=nums[f];
          f=nums[f];
          if(s==f){
            int low=0;
            while(low!=s){
                 s=nums[s];
                 low=nums[low];
            }
           return low;//entry point of cycle
          }
    }
  }
}