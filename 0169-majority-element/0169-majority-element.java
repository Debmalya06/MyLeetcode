class Solution {
    public int majorityElement(int[] nums) {

 int candidate = 0;  // Variable to store the majority candidate
        int count = 0;      // Count for candidate occurrences

        for (int i = 0; i < nums.length; i++) {  // Using normal for loop
            if (count == 0) {
                candidate = nums[i];  // Set new candidate
            }
            if (nums[i] == candidate) { // Check if current number is same as candidate
                count++; // Increase count
            } else {
                count--; // Decrease count
            }
        }

        return candidate; // The candidate must be the majority element
    }
}