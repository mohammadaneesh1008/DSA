class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] ans = new int[nums.length];
        int i = 0;
        int count = 0;
        for(int j=0;j<nums.length;j++){
            if (nums[j]<pivot) {
                ans[i++]=nums[j];
            } 
            else if(nums[j]==pivot){
                count++;
            }
        }
        while(count-->0){
            ans[i++] = pivot;
        }
        for(int j=0;j<nums.length;j++){
            if (nums[j]>pivot){
                ans[i++]=nums[j];
            }
        }
        return ans;
    }
}