class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int x : nums){
            if(map.containsKey(x)) map.put(x,map.get(x)+1);
            else map.put(x,1);
        }
        for(int x : map.keySet()){
            if(map.get(x)>(nums.length/2)) return x;
        }
        return 0;
    }
}