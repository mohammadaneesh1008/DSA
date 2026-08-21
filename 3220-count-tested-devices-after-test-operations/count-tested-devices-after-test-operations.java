class Solution {
    public int countTestedDevices(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>0){
                count++;
                for(int j=i+1;j<nums.length;j++){
                 if(nums[j]>0) nums[j]--;
              }
            }
        }
        if(nums[nums.length-1]!=0) count++;
        return count;
    }
}