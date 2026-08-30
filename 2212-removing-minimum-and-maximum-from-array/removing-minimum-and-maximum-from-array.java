class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length==1) return 1;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int minindex=0;
        int maxindex=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                maxindex=i;
            }
            if(nums[i]<min){
                min=nums[i];
                minindex=i;
            }
        }
        int l=Math.max(minindex,maxindex)+1;
        int r=nums.length-Math.min(minindex,maxindex);
        int b=Math.min(minindex,maxindex)+1+nums.length-Math.max(minindex,maxindex);
        return Math.min(l,Math.min(r,b));
    }
}