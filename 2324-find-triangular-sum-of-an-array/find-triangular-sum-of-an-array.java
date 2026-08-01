class Solution {
    public int triangularSum(int[] nums) {
       int n=0;
       while(n<nums.length-1){
          for(int i=0;i<nums.length-n-1;i++){
            nums[i]=(nums[i]+nums[i+1])%10;
          }
        n++;
       } 
        return nums[0];
    }
}