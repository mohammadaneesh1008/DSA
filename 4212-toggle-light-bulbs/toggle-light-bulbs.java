class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : bulbs){
            if(map.containsKey(x)){
                if(map.get(x)==0){
                    map.put(x,1);
                }
                else{
                    map.put(x,0);
                }
            }
            else{
                map.put(x,1);
            }
        }
        for(int x : map.keySet()){
            if(map.get(x)==1) ans.add(x);
        }
        Collections.sort(ans);
        return ans;
    }
}