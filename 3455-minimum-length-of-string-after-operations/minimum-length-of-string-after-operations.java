class Solution {
    public int minimumLength(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int ans=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                if(map.get(ch)==2) map.put(ch,1);
                else map.put(ch,map.get(ch)+1);
            }
            else map.put(ch,1);
        }
        for(char ch : map.keySet()) ans+=map.get(ch);
        return ans;
    }
}