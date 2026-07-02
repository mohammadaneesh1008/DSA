class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int a=1;
            for(int j=i;j<nums.length;j++){
                a=a*nums[j];
                if(a<k) count++;
                else break;
            }
        }
        return count;
    }
}