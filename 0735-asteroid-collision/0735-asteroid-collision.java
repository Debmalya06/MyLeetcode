class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int n : asteroids) {

            while (!stack.isEmpty() && stack.peek() > 0 && n < 0) {

                if (stack.peek() < -n) {
                    stack.pop();
                    continue;
                }
                else if (stack.peek() == -n) {
                    stack.pop();
                }

                n = 0;// to donot push further(here come thats mean peek>-n)
                break;
            }

            if (n != 0) {
                stack.push(n);
            }
        }

        int[] ans = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }
        return  ans;
    }
}