class Solution {
    public String reorganizeString(String s) {
        HashMap<Character,Integer>map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<>(
            (a,b)->{
                int fqcomp = Integer.compare(map.get(b), map.get(a));
                if(fqcomp==0) return a.compareTo(b);
                return fqcomp;
            }

        );
        //heap 
        for (char ch : map.keySet()) {
        pq.offer(ch);
}
        char[] res = new char[s.length()];
        int seat =0;
        while(pq.size()!=0 && seat<s.length()){
            char ch = pq.peek();//topvalue stored
            if(seat ==0 || res[seat-1]!=ch){
                res[seat]=ch;
                seat++;
                pq.poll();
                map.put(ch, map.get(ch) - 1);

                if (map.get(ch) > 0) {
                pq.offer(ch);
                    }
            }
            else{
                pq.poll();
                if(pq.isEmpty()) return "";
                res[seat]=pq.peek();
                seat++;
                char next=pq.poll();
                map.put(next, map.get(next) - 1);

                if (map.get(next) > 0) {
                pq.offer(next);
                    }

               //reinsert 
               if (map.get(ch) > 0) {
                 pq.offer(ch);
                }   
            }
        }
       return seat == s.length() ? new String(res) : "";

    }
}