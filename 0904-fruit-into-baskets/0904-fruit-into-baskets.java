class Solution {
    public static int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int i=0, j=0, ans=0;
        
        while(j<fruits.length){
            int n = fruits[j];//calculation
            map.put(n,map.getOrDefault(n,0)+1);

              //logic but that will not works always under (map.size()==2))
              //in case on {0}  it should picks  also, here that fail❌
//            if(map.size()==2){
//                ans= Math.max(j-i+1,ans);
//            }

          //window conditions adjust.
            if(map.size()>2){
                while(map.size()>2){
                    int x=fruits[i];
                    map.put(x, map.get(x) - 1);
                    if(map.get(x)==0) {
                        map.remove(x);
                    }
                    i++;
                }
            }
            ans= Math.max(j-i+1,ans);//here is the logic that find ans.(for <2 it will works 🤞)
            j++;
        }
        return ans;
    }
}