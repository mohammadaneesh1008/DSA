class Solution{
    public long maxSum(int[][] grid,int[] limits,int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<grid.length;i++){
            PriorityQueue<Integer> a = new PriorityQueue<>();
            for(int x:grid[i]){
                a.add(x);
                if(a.size()>limits[i]) a.remove();
            }
            pq.addAll(a);
        }
        long ans=0;
        while(k-->0) ans+=pq.poll();
        return ans;
    }
}