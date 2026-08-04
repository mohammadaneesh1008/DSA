class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int x : nums){
            max=Math.max(max,x);
            min=Math.min(min,x);
            set.add(x);
        }
        for(int i=min;i<=max;i++){
            if(!set.contains(i)) ans.add(i);
        }
        return ans;
    }
}