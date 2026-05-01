class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(char ch : s.toCharArray()){
            if(map.containsKey(ch)){
                int a = map.get(ch);
                map.put(ch,a+1);
            }
            else{
                map.put(ch,1);
            }
        }
        for(int x : map.values()){
            set.add(x);
        }
        if(set.size()==1) return true;
        return false;
    }
}