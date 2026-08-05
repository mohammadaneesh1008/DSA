class Solution {
    public int minMoves(int[] nums) {
        int ans=0;
        int max=Integer.MIN_VALUE;
        for(int x : nums) max=Math.max(max,x);
        for(int x : nums) ans+=(max-x);
        return ans;
    }
}