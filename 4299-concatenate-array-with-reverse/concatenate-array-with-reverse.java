class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] ans = new int[nums.length*2];
        int i=0;
        int j=nums.length-1;
        while(i<nums.length){
            ans[i]=nums[i];
            i++;
        }
        while(j>=0){
            ans[i]=nums[j];
            i++;
            j--;
        }
        return ans;
    }
}