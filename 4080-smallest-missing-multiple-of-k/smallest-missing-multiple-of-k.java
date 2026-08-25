class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums) set.add(x);
        int ans=k;
        int mul=1;
        while(true){
            if(!set.contains(ans)){
                return ans;
            }
            else{
                mul++;
                ans=k*mul;
            }
        }
    }
}