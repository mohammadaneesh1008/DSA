class Solution {
    public int hd(int x,int y){
    return Integer.bitCount(x^y);
    }
    public int totalHammingDistance(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                    ans+=hd(nums[i],nums[j]);
            }
        }
        return ans;
    }
}