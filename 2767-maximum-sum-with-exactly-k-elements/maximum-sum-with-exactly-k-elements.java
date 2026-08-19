class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max=0;
        int ans=0;
        for(int x : nums) max=Math.max(max,x);
        while(k>0){
            ans+=max;
            max+=1;
            k--;
        }
        return ans;
    }
}