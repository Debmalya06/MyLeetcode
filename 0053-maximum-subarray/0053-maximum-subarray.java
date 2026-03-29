class Solution {
    public int maxSubArray(int[] arr) {
    //as problem array have atleast one element then not need to think about empty array
    //[1,-2,3]--> default first ans =1and bestend =1-->
     int best=arr[0];
    int ans = arr[0];
    for(int i=1;i<arr.length;i++){
        int curr = arr[i];
        best = Math.max(curr, curr+best);
        ans = Math.max(best,ans);
    }
    return ans;
    }
}
