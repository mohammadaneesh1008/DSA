class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums){
            set.add(num);
        }
        int[] unique = new int[set.size()];
        int idx=0;
        for (int num : set){
            unique[idx++]=num;
        }
        Arrays.sort(unique);
        int size = Math.min(k, unique.length);
        int[] ans = new int[size];
        idx=unique.length-1;
        for (int i=0;i<size;i++){
            ans[i]=unique[idx--];
        }
        return ans;
    }
}