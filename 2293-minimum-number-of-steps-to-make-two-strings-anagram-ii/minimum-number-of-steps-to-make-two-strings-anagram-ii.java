class Solution {
    public int minSteps(String s, String t) {
      int count=0;
      HashMap<Character,Integer> maps = new HashMap<>();
      HashMap<Character,Integer> mapt = new HashMap<>();  
      for(char ch : s.toCharArray()){
        if(maps.containsKey(ch)){
            int a=maps.get(ch);
            maps.put(ch,a+1);
        }
        else{
            maps.put(ch,1);
        }
      }
      for(char ch : t.toCharArray()){
        if(mapt.containsKey(ch)){
            int a=mapt.get(ch);
            mapt.put(ch,a+1);
        }
        else{
            mapt.put(ch,1);
        }
      }
    for(char ch : maps.keySet()){
        if(mapt.containsKey(ch)){
            count+=Math.abs(maps.get(ch)-mapt.get(ch));
        }
        else{
            count+=maps.get(ch);
        }
    }
    for(char ch : mapt.keySet()) {
        if(!maps.containsKey(ch)){
            count+=mapt.get(ch);
        }
    }
    return count;
    }
}