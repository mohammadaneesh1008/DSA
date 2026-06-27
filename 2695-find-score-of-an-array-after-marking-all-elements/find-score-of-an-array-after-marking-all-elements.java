class Solution {
    public class Pair implements Comparable<Pair>{
        int index;
        int ele;
        Pair(int index, int ele){
            this.index=index;
            this.ele=ele;
        }
        public int compareTo(Pair p){
            if(this.ele==p.ele) return this.index-p.index;
            return this.ele-p.ele;
        }
    }
    public long findScore(int[] nums) {
        long ans=0;
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
        for(int i=0;i<nums.length;i++){
            int index=i;
            int ele=nums[i];
            pq.add(new Pair(index,ele));
        }
        while(!pq.isEmpty()){
            Pair p = pq.remove();
            if(nums[p.index]!=0){
            ans+=p.ele;
            nums[p.index]=0;
            if((p.index-1)>=0) nums[p.index-1]=0;
            if((p.index+1)<nums.length) nums[p.index+1]=0;}
        }
        return ans;
    }
}