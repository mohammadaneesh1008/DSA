class Solution {
    public int maxProduct(int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        while(n>0){
            pq.add(n%10);
            if(pq.size()>2) pq.remove();
            n/=10;
        }
        return pq.remove()*pq.remove();
    }
}