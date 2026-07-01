class Solution {
    public int matrixSum(int[][] grid) {
        int ans=0;
        ArrayList<PriorityQueue> list = new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            for(int j=0;j<grid[i].length;j++){
                pq.add(grid[i][j]);
            }
            list.add(pq);
        }
        while(!list.get(0).isEmpty()){
            int max=0;
            for(int i=0;i<list.size();i++){
                PriorityQueue<Integer> g = list.get(i);
                max=Math.max(max,g.remove());
            }
            ans+=max;
        }
        return ans;
    }
}