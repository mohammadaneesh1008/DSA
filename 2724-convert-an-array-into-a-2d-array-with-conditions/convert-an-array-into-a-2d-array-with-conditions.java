class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
      List<List<Integer>> ans = new ArrayList<>();
      HashSet<Integer> set = new HashSet<>();
      HashMap<Integer,Integer> map = new HashMap<>();
      for(int x : nums){
        set.add(x);
        if(map.containsKey(x)) map.put(x,map.get(x)+1);
        else map.put(x,1);
      }  
      int n=map.size();
      while(n!=0){
        ArrayList<Integer> a = new ArrayList<>();
        for(int x : set){
        if(map.containsKey(x)){
            if(map.get(x)==1){
            a.add(x);
            map.remove(x);
            n--;
        }
        else{
           a.add(x);
           map.put(x,map.get(x)-1);
        }
        }
      }
      ans.add(a);
      }
      return ans;
    }
}