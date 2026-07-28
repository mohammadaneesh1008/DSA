class Solution {
    public int findLHS(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<>();
       int mx=0;
       for(int x : nums){
        if(map.containsKey(x)) map.put(x,map.get(x)+1);
        else map.put(x,1);
       } 
       for(int x : map.keySet()){
           if(map.containsKey(x-1)){
            mx=Math.max(mx,map.get(x-1)+map.get(x));
           }
       }
       return mx;
    }
}