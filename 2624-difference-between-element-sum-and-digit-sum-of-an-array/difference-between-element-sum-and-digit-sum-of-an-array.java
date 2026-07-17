class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int digit=0;
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            sum+=a;
            while(a>0){
                digit+=a%10;
                a/=10;
            }
        }
        return Math.abs(sum-digit);
    }
}