class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        // boolean ans= true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='{'||s.charAt(i)=='('||s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }
            else{
                 if(stack.isEmpty()) return false;
                char topchar = stack.peek();
                if(combination(topchar,s.charAt(i))){
                    stack.pop();
                }
                else{
                    // ans = false;
                    return false;
                }
            }
        }
         return stack.isEmpty();
    }
    public boolean combination(char a, char b){
        if(a=='{'&& b=='}') return true;
        else if(a=='('&& b==')') return true;
        else if(a=='['&& b==']') return true;
        else return false;
    }

}