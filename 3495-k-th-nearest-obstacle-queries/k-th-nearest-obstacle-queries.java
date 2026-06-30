class Solution {
    public int[] resultsArray(int[][] queries, int k) {
        int[] ans = new int[queries.length];
        int a=0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<queries.length;i++){
            int x=queries[i][0];
            int y=queries[i][1];
            pq.add(Math.abs(x)+Math.abs(y));
            if(pq.size()>k) pq.remove();
            if(pq.size()<k) ans[a++]=-1;
            else ans[a++]=pq.peek();
        }
        return ans;
    }
}