class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int x : gifts) pq.add(x);
        while(!pq.isEmpty() && k!=0){
            int a=pq.remove();
            pq.add((int) Math.sqrt(a));
            k--;
        }
        long ans=0;
        while(!pq.isEmpty()){
                ans+=pq.remove();
        }
        return ans;
    }
}