class Solution {
    public int gcd(int a, int b) {
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public int minOperations(int[] nums, int[] numsDivide) {
        int hcf=numsDivide[0];
        for (int i=1;i<numsDivide.length;i++){
             hcf=gcd(hcf, numsDivide[i]);
        }
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i++){
            if (hcf%nums[i]==0){
                return i;
            }
        }
        return -1;
    }
}
   