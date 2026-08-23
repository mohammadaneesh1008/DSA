class Solution {
    public int maximumScore(int a, int b, int c) {
      PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
      pq.add(a);pq.add(b);pq.add(c);
      int count=0;
      while(pq.size()>1){
        int i=pq.remove();
        int j=pq.remove();
        i--;
        j--;
        count++;
        if(i>0) pq.add(i);
        if(j>0) pq.add(j);
      }
      return count;
    }
}