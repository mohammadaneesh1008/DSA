class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int mx=Integer.MIN_VALUE;
        int smx=Integer.MIN_VALUE;
        int tmx=Integer.MIN_VALUE;
        for(int x : set){
            if(x>mx){
                tmx=smx;
                smx=mx;
                mx=x;
            }
            else if(x>smx){
                tmx=smx;
                smx=x;
            }
            else if(x>tmx){
                tmx=x;
            }
        }
        if(set.size()>=3) return tmx;
        return mx;
    }
}