class Solution {
    public int[] twoSum(int[] arr, int target) {
        int i= 0;
        int j =  arr.length-1;
        int[] ans = new int[2];
          ans[0]=-1;
          ans[1]= -1;
        while(i<j){
            int sum = arr[i]+arr[j];
            if(sum> target) j--;
            else if(sum< target) i++;
            else {
                ans[0]=i+1;
                ans[1]= j+1;
                return ans;
            }
        }
        return ans;
    }
}