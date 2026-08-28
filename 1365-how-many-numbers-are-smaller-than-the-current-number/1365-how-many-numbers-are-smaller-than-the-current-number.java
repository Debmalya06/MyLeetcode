import java.util.*;

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        // Map each number to its first index in sorted array
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            // Only store the first occurrence (smallest index)
            map.putIfAbsent(sorted[i], i);
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = map.get(nums[i]);
        }
        return result;
    }
}
