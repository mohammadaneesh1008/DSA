class Solution {
    public class Pair implements Comparable<Pair>{
        char c;
        int freq;
        Pair(char c , int freq){
            this.c=c;
            this.freq=freq;
        }
        public int compareTo(Pair p){
         if(this.freq==p.freq) return p.c-this.c;
         return this.freq-p.freq;
        }
    }
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            if(map.containsKey(ch)){
                int a=map.get(ch);
                map.put(ch, a+1);
            }
            else{
                map.put(ch, 1);
            }
        }
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(Collections.reverseOrder());
        for(char ch : map.keySet()){
            char c = ch;
            int freq = map.get(ch);
            pq.add(new Pair(c, freq));
        }
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            Pair p = pq.remove();
            int l = p.freq;
            while(l>0){
                sb.append(p.c);
                l--;
            }
        }
        return sb.toString();
    }
}