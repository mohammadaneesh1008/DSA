class Solution {
    public int sortPermutation(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
        }
        Arrays.sort(nums);
        int k=-1;
        boolean f=true;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=ans[i]){
                f=false;
                if(k==-1) k=ans[i];
                else k=(k&ans[i]);
            }
        }
        if(f) return 0;
        return k;
    }
}