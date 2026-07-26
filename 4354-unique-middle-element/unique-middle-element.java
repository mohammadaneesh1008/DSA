class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
       int count=0;
       int ele=nums[nums.length/2];
       for(int i=0;i<nums.length;i++){
        if(nums[i]==ele) count++;
        if(count>1) return false;
       } 
       return true;
    }
}