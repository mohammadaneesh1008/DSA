class Solution {
    public class Pair implements Comparable<Pair>{
        int ele;
        int freq;
        Pair(int ele , int freq){
            this.ele=ele;
            this.freq=freq;
        }
        public int compareTo(Pair p){
         if(this.freq==p.freq) return p.ele-this.ele;
         return this.freq-p.freq;
        }
    }
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : nums){
            if(map.containsKey(ele)){
                int a=map.get(ele);
                map.put(ele, a+1);
            }
            else{
                map.put(ele, 1);
            }
        }
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
        for(int ele : map.keySet()){
            int freq = map.get(ele);
            pq.add(new Pair(ele, freq));
        }
        int[] ans = new int[nums.length];
        int i=0;
        while(!pq.isEmpty()){
            Pair p = pq.remove();
            int f=p.freq;
            while(f>0){
                ans[i++]=p.ele;
                f--;
            }
        }
        return ans;
    }
}