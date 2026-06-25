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
    public String reorganizeString(String s) {
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
        while(pq.size()>1){
            Pair p1 = pq.remove();
            Pair p2 = pq.remove();
            sb.append(p1.c);
            sb.append(p2.c);
            p1.freq--;
            p2.freq--;
            if(p1.freq>0) pq.add(p1);
            if(p2.freq>0) pq.add(p2);
        }
        if(!pq.isEmpty()) {
            Pair last=pq.remove();
            if (last.freq>1)
                return "";
            sb.append(last.c);
        }
        return sb.toString();
    }
}