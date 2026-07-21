class Solution {
    public long[] findPrefixScore(int[] nums) {
        long[] ans = new long[nums.length];
        int max=nums[0];
        ans[0]=(long)nums[0]+max;
        for (int i=1;i<nums.length;i++) {
            max=Math.max(max,nums[i]);
            ans[i]=ans[i-1]+(long)nums[i]+max;
        }
        return ans;
    }
}