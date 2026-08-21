class Solution {
    public boolean check(String s, String r){
        HashMap<Character,Character> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char chS=s.charAt(i);
            char chR=r.charAt(i);
            if(map.containsKey(chS) && map.get(chS)!=chR){
                return false;
            }
            else{
                map.put(chS,chR);
            }
        }
        HashSet<Character> set = new HashSet<>();
        for(char ch : map.values()) set.add(ch);
        if(set.size()!=map.size()) return false;
        return true;
    }
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(check(pattern,words[i])) ans.add(words[i]);
        }
        return ans;
    }
}