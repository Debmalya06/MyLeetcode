class Solution {
    public int[] findErrorNums(int[] nums) {
      int arr[]= new int[nums.length+1];
      int dup=-1, mis=-1;
      for(int n:nums){
        arr[n]++;
      }
      for(int i=1;i<=nums.length;i++){
        if(arr[i]==0) mis=i;
        if(arr[i]>1) dup=i;
      }

      return new int[]{dup,mis};  
    }
}