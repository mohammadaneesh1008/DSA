class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character,Integer> map = new HashMap<>();
        for(char ch : stones.toCharArray()){
            if(map.containsKey(ch)) map.put(ch,map.get(ch)+1);
            else map.put(ch,1);
        }
        int ans=0;
        for(char ch : jewels.toCharArray()){
           if(map.containsKey(ch)) ans+=map.get(ch);
        }
        return ans;
    }
}