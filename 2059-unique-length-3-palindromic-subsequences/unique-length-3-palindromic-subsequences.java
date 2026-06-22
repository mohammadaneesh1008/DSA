class Solution {
    public int countPalindromicSubsequence(String s) {
        HashMap<Character,Integer> mapf = new HashMap<>();
        HashMap<Character,Integer> mapl = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!mapf.containsKey(s.charAt(i))){
                mapf.put(s.charAt(i), i);
            }
            mapl.put(s.charAt(i), i);
        }
        int count=0;
        for(char ch : mapf.keySet()){
            HashSet<Character> set = new HashSet<>();
            for(int j=mapf.get(ch)+1;j<mapl.get(ch);j++){
                set.add(s.charAt(j));
            }
            count+=set.size();
        }
        return count;
    }
}