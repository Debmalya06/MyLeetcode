class Solution {
    public boolean isHappy(int n) {
      int f=n, s=n;
    while(f!=1){
        s=findsqr(s);
        f=findsqr(f);
        f=findsqr(f);
     if(s==f && s!=1){
            return false;
        }
    }
    return true;
    }
    public int findsqr(int n){
        int ret=0;
        while(n>0){
        int x=n%10;
        ret+=x*x;
        n=n/10;
        }
        return ret;
    }
}