class Solution {
    public int maximumSum(int[] arr) {
        int nodel=arr[0];
        int onedel=0;
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            onedel=Math.max(nodel,onedel+arr[i]);
            nodel= Math.max(arr[i], nodel+arr[i]);
            ans = Math.max(ans, Math.max(onedel, nodel));
        }
        return ans;
    }
}