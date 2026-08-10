class Solution {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int x : nums) pq.add(x);
        while(k>0){
            int a=pq.remove();
            pq.add(a+1);
            k--;
        }
        long ans=1;
        while(!pq.isEmpty()){
            ans=(ans*(pq.remove()))%1000000007;
        }
        return (int)ans;
    }
}