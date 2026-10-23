import java.util.*;

class Pair {
    int num;
    int freq;

    Pair(int num, int freq) {
        this.num = num;
        this.freq = freq;
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequencies
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Min heap on frequency
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> {
                if (a.freq != b.freq) {
                    return Integer.compare(a.freq, b.freq);
                }
                return Integer.compare(a.num, b.num);
            }
        );

        // Keep only k most frequent elements
        for (int num : map.keySet()) {
            pq.offer(new Pair(num, map.get(num)));

            if (pq.size() > k) {
                pq.poll();
            }
        }

        // Extract the answer
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = pq.poll().num;
        }

        return result;
    }
}