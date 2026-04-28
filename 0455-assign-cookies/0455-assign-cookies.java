class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int n = g.length, m= s.length;
        int r=0;// for g 
        int l=0;// for s
        // will give cookie at l antil for m no of std.
        while(l<m && r<n){
            if(g[r]<=s[l]){
                r++;
            }
            l++;
        }
        // final r is out of array size position, while start from 0 so r is ok for ans, as we want last value count in g(how many child get).
        return r;
    }
}