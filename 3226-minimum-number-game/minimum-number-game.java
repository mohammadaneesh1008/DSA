class Solution {
    public int[] numberGame(int[] nums) {
        int[] ans = new int[nums.length];
        Arrays.sort(nums);
        int k=0;
        int i=0;
        int j=1;
        while(j<nums.length && i<nums.length){
            ans[k++]=nums[j];
            ans[k++]=nums[i];
            i+=2;
            j+=2;
        }
        return ans;
    }
}