class Solution {
    public long findTheArrayConcVal(int[] nums) {
       long ans=0;
       int i=0; int j=nums.length-1;
       while(i<j){
        int sum=nums[i];
        int n=nums[j];
        while(n>0){
            sum*=10;
            n/=10;
        }
        sum+=nums[j];
        ans+=sum;
        i++;
        j--;
       }
       if(i==j) ans+=nums[j];
       return ans;
    }
}