class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        int less=0;
        int equal=0;
        for(int x : nums){
            if(x==target) equal++;
            else if(x<target) less++;
        }
        if(less==nums.length) return ans;
        while(equal>0){
            ans.add(less++);
            equal--;
        }
        return ans;
    }
}