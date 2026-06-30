class Solution {
    public class Pair implements Comparable<Pair> {
        int index;
        int ele;
        Pair(int index, int ele) {
            this.index = index;
            this.ele = ele;
        }
        public int compareTo(Pair p) {
            return p.ele - this.ele;
        }
    }
    public int miceAndCheese(int[] arr1, int[] arr2, int k) {
        int ans = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (int i=0;i<arr1.length;i++) {
            ans+= arr2[i];                  
            pq.add(new Pair(i,arr1[i]-arr2[i])); 
        }
        while(k-->0){
            ans+=pq.remove().ele;
        }
        return ans;
    }
}