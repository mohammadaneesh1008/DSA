class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()) return false;
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(char ch : s.toCharArray()){
            if(map1.containsKey(ch)){
                int a=map1.get(ch);
                map1.put(ch,a+1);
            }
            else{
                map1.put(ch,1);
            }
        }
        for(char ch : t.toCharArray()){
            if(map2.containsKey(ch)){
                int a=map2.get(ch);
                map2.put(ch,a+1);
            }
            else{
                map2.put(ch,1);
            }
        }
        for(char ch : map1.keySet()){
            if(!map2.containsKey(ch) || !map1.get(ch).equals(map2.get(ch))){
                return false;
            }
        }
        return true;
    }
}