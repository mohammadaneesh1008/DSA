class Solution {
    public int missingInteger(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
       for(int x : nums) set.add(x);
       if(nums.length==1) return nums[0]+1;
       int sum=nums[0];
       int i=1;
       while(i<nums.length && nums[i]==nums[i-1]+1){
            sum+=nums[i];
            i++;
       }
       for(int j=sum;j<=sum+50;j++){
        if(!set.contains(j)) return j;
      }
      return sum;
    }
}