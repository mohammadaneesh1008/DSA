class Solution {
    public int sortPermutation(int[] nums) {
        int k=-1;
        boolean f=true;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                f=false;
                if(k==-1) k=nums[i];
                else k=(k&nums[i]);
            }
        }
        if(f) return 0;
        return k;
    }
}