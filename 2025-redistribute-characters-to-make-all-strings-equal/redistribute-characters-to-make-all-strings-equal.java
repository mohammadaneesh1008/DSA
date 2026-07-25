class Solution {
    public boolean makeEqual(String[] words) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<words.length;i++){
           for(char ch : words[i].toCharArray()){
            if(map.containsKey(ch)) map.put(ch,map.get(ch)+1);
            else map.put(ch,1);
           }
        }
        for(int x : map.values()){
          if(x%words.length!=0){
                return false;
            }
        }
        return true;
    }
}