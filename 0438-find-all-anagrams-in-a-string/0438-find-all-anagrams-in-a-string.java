class Solution 
{
    public List<Integer> findAnagrams(String s, String p) {
       HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<p.length();i++){
            char ch=p.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);// creation of map
        }
        int i=0, j=0,ans=0;
        ArrayList<Integer> list = new ArrayList<>();
        int count = map.size();

        while(j<s.length())
    {
        //base calculation
            char ch = s.charAt(j);
        if(map.containsKey(ch)){      
            int val = map.get(ch);
            map.put(ch,--val);//decrement the value of char; ex- a-3--> a-2
            
            if(val==0) count--; // count= 2--> 1 when a or b =0
          }
        if(j-i+1<p.length()) j++; // increase j till window find

        else
        {
            if(count ==0){
                list.add(i);// anagram add, ans it is.
            } 
            //window silding
            if(map.containsKey(s.charAt(i))){
            int val=map.get(s.charAt(i));
            
            if(val ==0) count++;
            
            map.put(s.charAt(i),++val);// add value of integer; ex- a=0-->1
        }
        i++;
        j++;
        }
        
    }
    return list;
    }
}
