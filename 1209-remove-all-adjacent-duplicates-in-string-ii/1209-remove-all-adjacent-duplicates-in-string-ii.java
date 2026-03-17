class Solution {

    class Pair{
        char c;
        int count;
        Pair(char c, int count){
            this.c=c;
            this.count=count;
        }
    }
    public String removeDuplicates(String s, int k) {
        Stack <Pair> stack = new Stack<>();
       for(char ch: s.toCharArray()){
        if(!stack.isEmpty() && stack.peek().c==ch){
            stack.peek().count++;
            if(stack.peek().count==k) stack.pop();
        }
       else{
        stack.push(new Pair(ch,1));
       }
       }
       StringBuilder sb = new StringBuilder();

        for(Pair p : stack){
            for(int i=0;i<p.count;i++){
                sb.append(p.c);
            }
        }
        return sb.toString();
    }
}