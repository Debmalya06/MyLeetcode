class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
         int a = m - 1; // Pointer for nums1
        int b = n - 1; // Pointer for nums2
        int p = m + n - 1; // Pointer for the current position in nums1

        while (b >= 0) {
            if (a >= 0 && nums1[a] > nums2[b]) {
                nums1[p--] = nums1[a--];
            } else {
                nums1[p--] = nums2[b--];
            }
        }



    }
}