class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
       int dec=0;
       List<Boolean> ans = new ArrayList<>();
       for(int i=0;i<nums.length;i++){
            dec=(dec*2+nums[i])%5;
            if(dec==0) ans.add(true);
            else ans.add(false);
       } 
       return ans;
    }
}