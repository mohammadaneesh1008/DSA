class Solution {
    public int firstUniqueEven(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : nums){
            if(map.containsKey(x)){
                int a=map.get(x);
                map.put(x,a+1);
            }
            else{
                map.put(x,1);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0 && map.get(nums[i])==1){
                    return nums[i];
            }
        }
        return -1;
    }
}