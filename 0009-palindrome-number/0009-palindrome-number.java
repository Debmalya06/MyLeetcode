class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int org=x;
        while(x>0){
            int m=x%10;
            rev=rev*10+m;
            x=x/10;
        }
        if(rev==org) return true;
        else return false;
    }
}