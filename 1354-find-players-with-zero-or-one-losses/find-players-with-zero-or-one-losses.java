class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<Integer> winner = new HashSet<>();
        HashMap<Integer,Integer> loser = new HashMap<>();
        for(int i=0;i<matches.length;i++){
            winner.add(matches[i][0]);
            if(loser.containsKey(matches[i][1])){
                int a=loser.get(matches[i][1]);
                loser.put(matches[i][1],a+1);
            }
            else{
                loser.put(matches[i][1],1);
            }
        }
        List<Integer> w = new ArrayList<>();
        for(int x : winner){
            if(!loser.containsKey(x)) w.add(x);
        }
        List<Integer> l = new ArrayList<>();
        for(int x : loser.keySet()){
            if(loser.get(x)==1) l.add(x);
        }
        Collections.sort(w);
        Collections.sort(l);
        ans.add(w);
        ans.add(l);
        return ans;
    }
}