class Solution {
    public int totalFruit(int[] fruits) {
        int low=0,high=0,ans =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(high<fruits.length){
            int n=fruits[high];
            map.put(n, map.getOrDefault(n, 0) + 1);
            while(map.size()>2){
                int n2=fruits[low];
                map.put(n2,map.get(n2)-1);
                if(map.get(n2)==0) map.remove(n2);
                low++;
            }
            ans = Math.max(ans,(high-low+1));
            high++;
        }
        return ans;
    }
}