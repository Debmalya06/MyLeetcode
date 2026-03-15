class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer>stack1 = new Stack<>();
        Stack<Integer>stack2= new Stack<>();
        HashMap<Integer, Integer> map =new HashMap<>();

        for(int i=0;i<temp.length;i++){
            while(!stack1.isEmpty() && stack1.peek()<temp[i]){
                int x= stack2.pop();
                map.put(x,i-x);
                stack1.pop();
            }
            stack1.push(temp[i]);
            stack2.push(i);
        }
        int ans[] = new int[temp.length];

        for(int i=0;i<temp.length;i++){
            ans[i] = map.getOrDefault(i, 0);
        }
        return ans;

    }
}