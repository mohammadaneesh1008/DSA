class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : nums){
            if(map.containsKey(x)) map.put(x,map.get(x)+1);
            else map.put(x,1);
        }
        int min=Integer.MAX_VALUE;
        for(int x : map.keySet()){
            int m=Integer.MAX_VALUE;
            if(map.get(x)>=3){
                int[] ans = new int[map.get(x)];
                int j=0;
                for(int i=0;i<nums.length;i++){
                    if(nums[i]==x){
                        ans[j++]=i;
                    }
                }
                for(int i=0;i<ans.length-2;i++){
                    m=Math.min(m,Math.abs(ans[i]-ans[i+1])+Math.abs(ans[i+1]-ans[i+2])+Math.abs(ans[i]-ans[i+2]));
                }
            }
            min=Math.min(m,min);
        }
        if(min==Integer.MAX_VALUE) return -1;
        return min;
    }
}