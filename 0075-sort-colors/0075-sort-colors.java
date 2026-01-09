//Override Approach
// class Solution {
//   public void sortColors(int[] arr) {
//   int two=0,zero=0,one=0;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==0) zero++;
//             else if(arr[i]==1) one++;
//             else two++;
//         }
//         int index= 0;
//         for(int i=0;i<zero;i++) {
//             arr[index++]=0;
//         }
//         for(int i=0;i<one;i++) {
//             arr[index++]=1;
//         }
//         for(int i=0;i<two;i++) {
//             arr[index++]=2;
//         }
// }
// }
//Dutch National Flag Algo

class Solution {
  public void sortColors(int[] nums) {
    int low = 0, mid = 0, high = nums.length - 1;
    while (mid <= high) {
        if (nums[mid] == 0) {
            int tmp = nums[low];
            nums[low++] = nums[mid];
            nums[mid++] = tmp;
        } else if (nums[mid] == 1) {
            mid++;
        } else {
            int tmp = nums[mid];
            nums[mid] = nums[high];
            nums[high--] = tmp;
        }
    }
}
}