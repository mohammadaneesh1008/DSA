class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int K) {
        int count=0;
        int l=0,p=1;
        if(K<1) return 0;
    for(int i=0;i<nums.length;i++){
      p*=nums[i];
      while(p>=K && l<=i){
        p=p/nums[l];
        l++;
      }
      if(p<K) count+=(i-l+1);
    }
    return count;
    }
}