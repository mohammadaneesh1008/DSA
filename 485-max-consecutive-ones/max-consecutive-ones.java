class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0,j=0,max=0;
        while(i<nums.length){
            while(i<nums.length && nums[i]==0) i++;
            j=i;
            while(j<nums.length && nums[j]==1) j++;
        max=Math.max(max,j-i);
        i=j;
        }
        return max;
    }
}