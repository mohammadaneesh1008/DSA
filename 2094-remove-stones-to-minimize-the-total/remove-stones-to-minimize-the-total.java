class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int x : piles) pq.add(x);
        while(k>0 && !pq.isEmpty()){
            int a=pq.remove();
            pq.add((a+1)/2);
            k--;
        }
        int ans=0;
        while(!pq.isEmpty()){
            ans+=pq.remove();
        }
        return ans;
    }
}