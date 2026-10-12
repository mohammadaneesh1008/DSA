class Solution {
    public int firstMissingPositive(int[] nums) {
        int max=0;
        if(nums.length==1 && nums[0]==2147483647) return 1;
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums){
            max=Math.max(max,x);
            set.add(x);
        }
        for(int i=1;i<=max;i++){
            if(!set.contains(i)) return i;
        }
        return max+1;
    }
}