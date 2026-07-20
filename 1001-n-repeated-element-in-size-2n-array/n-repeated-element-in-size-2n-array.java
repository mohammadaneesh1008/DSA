class Solution {
    public int repeatedNTimes(int[] nums) {
        int n=nums.length/2;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : nums){
            if(map.containsKey(x)){
                int a=map.get(x);
                map.put(x,a+1);
                if(map.get(x)==n){
                    return x;
                }
            }
            else{
                map.put(x,1);
            }
        }
        return 0;
    }
}