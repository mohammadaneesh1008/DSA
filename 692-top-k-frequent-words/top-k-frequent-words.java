class Solution {
    public class Pair implements Comparable<Pair>{
        String word;
        int freq;
        Pair(String word, int freq){
            this.word=word;
            this.freq=freq;
        }
        public int compareTo(Pair p){
            if (this.freq == p.freq)
                return p.word.compareTo(this.word);
            return this.freq-p.freq;
        }
    }
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        for(String s : words){
            if(map.containsKey(s)){
                int a=map.get(s);
                map.put(s, a+1);
            }
            else{
                map.put(s, 1);
            }
        }
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
        for(String word : map.keySet()){
            int freq = map.get(word);
            pq.add(new Pair(word, freq));
            if(pq.size()>k) pq.remove();
        }
        List<String> ans = new ArrayList<>();
        for(int i=0;i<k;i++){
            Pair p = pq.remove();
            ans.add(p.word);
        }
        Collections.reverse(ans);
        return ans;
    }
}