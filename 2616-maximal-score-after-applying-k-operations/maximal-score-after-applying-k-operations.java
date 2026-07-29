class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int x : nums) pq.add(x);
        long sum=0;
        while(!pq.isEmpty() && k>0){
            int a=pq.remove();
            sum+=a;
            pq.add((a+2)/3);
            k--;
        }
        return sum;
    }
}