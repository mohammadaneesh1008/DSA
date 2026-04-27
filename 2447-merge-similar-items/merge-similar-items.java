class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> ans = new ArrayList<>();
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i=0;i<items1.length;i++){
            if(map.containsKey(items1[i][0])){
                int a=map.get(items1[i][0]);
                map.put(items1[i][0],a+items1[i][1]);
            }
            else{
                map.put(items1[i][0],items1[i][1]);
            }
        }
        for(int i=0;i<items2.length;i++){
            if(map.containsKey(items2[i][0])){
                int a=map.get(items2[i][0]);
                map.put(items2[i][0],a+items2[i][1]);
            }
            else{
                map.put(items2[i][0],items2[i][1]);
            }
        }
        for(int x : map.keySet()){
            List<Integer> a = new ArrayList<>();
            a.add(x);
            a.add(map.get(x));
            ans.add(a);
        }
        return ans;
    }
}