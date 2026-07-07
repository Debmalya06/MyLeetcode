class Solution {
    public long sumAndMultiply(int n) {
        int ns=0, sum= 0, ns2=0;
        while(n!=0){
            int modulo=n%10;
            if(modulo!=0){
               ns=ns*10+modulo;
                sum+=modulo; 
            }
            n=n/10;
        }
        while(ns!=0){
            int m=ns%10;
            ns2=ns2*10+m;
            ns=ns/10;
        }
        return (long) ns2*sum;
    }
    }
