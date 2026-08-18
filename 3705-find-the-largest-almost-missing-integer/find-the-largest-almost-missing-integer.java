class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max=0;
        for(int x : nums){
            max=Math.max(max,x);
            if(map.containsKey(x)) map.put(x,map.get(x)+1);
            else map.put(x,1);
        }
        if(k==1){
            int m=-1;
            for(int x : map.keySet()){
                if(map.get(x)==1 && x>m){
                    m=x;
                }
            }
            return m;
        }
        else if(k==nums.length) return max;
        else{
          if(map.get(nums[0])==1 && map.get(nums[nums.length-1])==1) return Math.max(nums[0],nums[nums.length-1]);
          else if(map.get(nums[0])==1 || map.get(nums[nums.length-1])==1){
            if(map.get(nums[0])==1) return nums[0];
            return nums[nums.length-1];
          }
          return -1;
        }
    }
}