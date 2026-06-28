class Solution {
    public List<Integer> findLonely(int[] nums) {
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
    List<Integer> ans = new ArrayList<>();
    for(int x : map.keySet()){
        if(map.get(x)==1 && !map.containsKey(x-1) && !map.containsKey(x+1)){
            ans.add(x);
        }
    }
    return ans;
    }
}