class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i=s.length()-1,j=t.length()-1;
        int shc=0, thc=0;
    while(i>=0 || j>=0 ){
       while(i>=0){
        if(s.charAt(i)=='#'){
            shc++;
            i--;
        }
        else if(shc>0){
            shc--;
            i--;
        }
        else {
            break;
        }
       }

    while(j>=0){
        if(t.charAt(j)=='#'){
            thc++;
            j--;
        }
        else if(thc>0){
            thc--;
            j--;
        }
        else break;
       }
    //check same/not
    if(i>=0 && j>=0){
        if(s.charAt(i)!= t.charAt(j)) return false;
    }
    else if(i>=0 || j>=0) return false; // for diff len
    i--;
    j--;
    }
    return true;
    }
}