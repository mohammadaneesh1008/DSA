class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int a=nums[0];
        int b=nums[nums.length-1];
        while(a>1){
            if(b%a==0) return a;
            else{
                int p=b%a;
                b=a;
                a=p;
            }
        }
        return 1;
    }
}