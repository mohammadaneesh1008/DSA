class Solution {
    public int maxProduct(int[] nums) {
        int mx=0;
        int smx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>mx){
                smx=mx;
                mx=nums[i];
            }
            else if(nums[i]>smx){
                smx=nums[i];
            }
        }
        return (mx-1)*(smx-1);
    }
}