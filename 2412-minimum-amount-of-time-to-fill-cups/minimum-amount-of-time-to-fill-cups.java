class Solution {
    public int fillCups(int[] amount) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int x : amount) if(x!=0) pq.add(x);
        int ans=0;
        if(amount[0]==0 && amount[1]==0 && amount[2]==0) return ans;
        while(!pq.isEmpty()){
            int a=pq.remove();
            a--;
            if(!pq.isEmpty()){
                int b=pq.remove();
                b--;
                if(b>0) pq.add(b);
            }
            if(a>0) pq.add(a); 
            ans++;
        }
        return ans;
    }
}