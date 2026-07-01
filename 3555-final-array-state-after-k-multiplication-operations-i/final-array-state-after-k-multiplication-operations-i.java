class Solution {
    public class Pair implements Comparable<Pair>{
        int ele;
        int index;
        Pair(int ele, int index){
            this.ele=ele;
            this.index=index;
        }
        public int compareTo(Pair p){
            if(this.ele==p.ele) return this.index-p.index;
            return this.ele-p.ele;
        }
    }
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            int ele=nums[i];
            pq.add(new Pair(ele,i));
        }
        while(k>0){
            Pair p = pq.remove();
            int e = p.ele*multiplier;
            nums[p.index]=e;
            p.ele=e;
            pq.add(p);
            k--;
        }
        return nums;
    }
}