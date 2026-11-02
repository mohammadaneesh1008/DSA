class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int ans=0;
        for(int x : nums){
            if(set.contains(x)) ans^=x;
            set.add(x);
        }
        return ans;
    }
}