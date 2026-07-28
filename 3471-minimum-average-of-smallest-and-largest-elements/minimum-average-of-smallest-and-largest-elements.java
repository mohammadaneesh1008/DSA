class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        double ans=Integer.MAX_VALUE;
        while(j>i){
            ans=Math.min(ans,(nums[j]+nums[i])/2.0);
            i++;j--; 
        }
        return ans;
    }
}