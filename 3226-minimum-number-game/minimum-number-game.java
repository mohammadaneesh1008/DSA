class Solution {
    public int[] numberGame(int[] nums) {
        int[] ans = new int[nums.length];
        int i=0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int x : nums) pq.add(x);
        while(!pq.isEmpty()){
            int alice=pq.remove();
            int bob=pq.remove();
            ans[i++]=bob;
            ans[i++]=alice;
        }
        return ans;
    }
}