class Solution {
    public int[]  findErrorNums(int[] nums) {
         int i=0;
         int m= 0;
         int d= 0;
int arr[]= new int[2]; 
        while(i<nums.length){
            int correct = nums[i]-1;
        if(nums[correct] != nums[i]){
            int temp = nums[i];
            nums[i]= nums[correct];
            nums[correct]= temp;
        }
        else{
            i++;
        }
    }
    for(int j=0;j<nums.length;j++){
        if(nums[j]!=j+1){
      return new int[] {nums[j],j+1};
        }
    }
    return new int[] {-1,-1};
    
    }
}