class Solution {
    public int subarraySum(int[] nums, int k) {
    Map<Integer, Integer> prefixCount = new HashMap<>();
    prefixCount.put(0, 1); // base case

    int sum = 0, count = 0;
    for (int num : nums) {
        sum += num;
        int ques=sum-k;
        count += prefixCount.getOrDefault(ques, 0);
        prefixCount.put(sum, prefixCount.getOrDefault(sum, 0) + 1);
    }

    return count;
    }
}