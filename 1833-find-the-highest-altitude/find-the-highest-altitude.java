class Solution {
    public int largestAltitude(int[] gain) {
       int ans=0;
       int prev=0;
       for(int i=0;i<gain.length;i++){
        int a=gain[i]+prev;
        ans=Math.max(ans,a);
        prev=a;
       } 
       return ans;
    }
}