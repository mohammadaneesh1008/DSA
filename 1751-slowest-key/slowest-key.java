class Solution {
    public class Pair implements Comparable<Pair>{
        char key;
        int time;
        Pair(char key, int time){
            this.key=key;
            this.time=time;
        }
        public int compareTo(Pair p){
            if(this.time==p.time) return this.key-p.key;
            return this.time-p.time;
        }
    }
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<keysPressed.length();i++){
            char key = keysPressed.charAt(i);
            if(i==0){
                int time=releaseTimes[0];
                pq.add(new Pair(key, time));
            }
            else{
                int time=releaseTimes[i]-releaseTimes[i-1];
                pq.add(new Pair(key,time));
            }
        }
        Pair p = pq.remove();
        return p.key;
    }
}