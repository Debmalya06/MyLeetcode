class Solution {
    public boolean lemonadeChange(int[] bills) {
        int i=0;
        int a=0,b=0;
        while(i<bills.length){
            if(bills[i]==5) a++;
            else if(bills[i]==10){
                if(a>0){
                a--;
                b++;}
                else return false;
            }
            else if( bills[i]==20){
                if(a>0 && b>0){
                    a--;
                    b--;
                }
                else if(a>=3) a-=3;
                else return false;
            }
            i++;

        }
        return true;
    }
}