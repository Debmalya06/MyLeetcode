class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map= new HashMap<>();
        for(String s: words){
            map.put(s,map.getOrDefault(s, 0)+1);
        }

        PriorityQueue<String>pq= new PriorityQueue<>(
            (a,b)->{
                int freqcomp= Integer.compare(map.get(a), map.get(b) );
                if( freqcomp==0) return b.compareTo(a);
                return freqcomp;
            }
        );
        for(String s: map.keySet()){
            pq.offer(s);
            if(pq.size()>k){
                pq.poll();
            }
        }
        List<String> ans = new ArrayList<>();
        for(int i=0;i<k;i++) ans.add(pq.poll());

         Collections.reverse(ans);
         return ans;
    }
}