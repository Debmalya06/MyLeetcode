class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int size = nums1.length + nums2.length;
        int []arr = new int[size];
        int i=0, j=0, k=0;
        //start merge
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                arr[k++]= nums1[i++];
            }
            else{
                arr[k++]=nums2[j++];
            }
        }
    // add rest part from 1st or 2nd array...
        while(i<nums1.length){
            arr[k++]=nums1[i++];
        }

        while (j < nums2.length) {
            arr[k++] = nums2[j++];

        }
        //find the midian
          double median;
        if (size % 2 == 1) {
            median = arr[size / 2];
        } else {
            median = (arr[size / 2 - 1] + arr[size / 2]) / 2.0;
        }

       return median;

    }
}