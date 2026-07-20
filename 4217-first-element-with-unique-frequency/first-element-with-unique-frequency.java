class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : nums){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }
            else {
                map.put(x,1);
            }
        }
        HashMap<Integer,Integer> map1 = new HashMap<>();
        for(int x : map.values()){
            if(map1.containsKey(x)){
                map1.put(x,map1.get(x)+1);
            }
            else{
                map1.put(x,1);
            }
        }
        for(int i=0;i<nums.length;i++){
            int ele=nums[i];
            if(map1.get(map.get(ele))==1){
                return ele;
            }
        }
        return -1;
    }
}