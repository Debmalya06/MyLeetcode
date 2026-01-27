class Solution {
    public int maximumSum(int[] arr) {
        int best=arr[0];
        int del=0;
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            del= Math.max(best, del+arr[i]);
              best= Math.max(arr[i], arr[i]+best);
           ans = Math.max(ans,(Math.max(del,best)));
              }
        return ans;
    }
}