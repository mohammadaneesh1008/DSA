class Solution {
    public int countGoodSubstrings(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int i=0,j=3,count=0;
        if(s.length()<3) return 0;
        while(i<j){
            if(map.containsKey(s.charAt(i))) map.put(s.charAt(i),map.get(s.charAt(i))+1);
            else map.put(s.charAt(i),1);
            i++;
        }
        i=0;
        if(map.size()==3) count++;
        while(j<s.length()){
            if(map.containsKey(s.charAt(j))) map.put(s.charAt(j),map.get(s.charAt(j))+1);
            else map.put(s.charAt(j),1);
            if(map.get(s.charAt(i))>1) map.put(s.charAt(i),map.get(s.charAt(i))-1);
            else map.remove(s.charAt(i));
            if(map.size()==3) count++;
            i++;j++;
        }
        return count;
    }
}