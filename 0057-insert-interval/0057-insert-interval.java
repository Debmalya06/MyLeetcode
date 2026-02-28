class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
            Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int[][] newarr= new int[intervals.length+1][2];
        boolean inserted = false;
        int i=0;
        int j=0;
          while (i < intervals.length) {

            if (!inserted && newInterval[0] < intervals[i][0]) {
                newarr[j++] = newInterval;
                inserted = true;
            }

            newarr[j++] = intervals[i++];
        }
        //if inserted part is large that whole given array.
           if (!inserted) {
            newarr[j] = newInterval;
        }
//merge part
     
        ArrayList<int[]> res= new ArrayList<>();
        int s1= newarr[0][0], e1=newarr[0][1];

       for(int k=1;k<newarr.length;k++){
           int s2 = newarr[k][0];
           int e2 = newarr[k][1];
            if(e1>=s2){
                e1=Math.max(e1,e2);
            }
            else{
                res.add(new int[]{s1,e1});
                s1=s2;
                e1=e2;   
            }
        }
         res.add(new int[]{s1,e1});
       return res.toArray(new int[res.size()][]);


    }
}