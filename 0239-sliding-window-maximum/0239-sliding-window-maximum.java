class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int i = 0, j = 0;

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        while (j < nums.length) {
            //calculations
            while (!list.isEmpty() && list.get(list.size() - 1) < nums[j]) {
                list.remove(list.size() - 1);
            }

            list.add(nums[j]);
            //window size less
            if (j - i + 1 < k)
                j++;
            //window size hit
            else {
                //ans is front of list
                ans.add(list.get(0));
                //sliding the window
                if (list.get(0) == nums[i]) {
                    list.remove(0);
                }
                i++;
                j++;
            }
        }
        int[] arr = new int[ans.size()];
        for (int x = 0; x < ans.size(); x++) {
            arr[x] = ans.get(x);
        }

        return arr;
    }
}