class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer>stack1 = new Stack<>();
        int ans[] = new int [temp.length];
        

        for(int i=0;i<temp.length;i++){
            while(!stack1.isEmpty() && temp[stack1.peek()]<temp[i]){
               int x= stack1.pop();
                ans[x]=i-x;
            }
            stack1.push(i);
        }
       
        return ans;

    }
}