class Solution {
    public int[][] merge(int[][] arr) {
        if (arr.length <= 1) return arr;
         Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        ArrayList<int[]> res= new ArrayList<>();
        int s1= arr[0][0], e1=arr[0][1];

       for(int i=1;i<arr.length;i++){
           int s2 = arr[i][0];
           int e2 = arr[i][1];
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