class Solution {
    public int minSteps(String s, String t) {
        int count=0;
        HashMap<Character,Integer> mapS = new HashMap<>();
        HashMap<Character,Integer> mapT = new HashMap<>();
        for(char ch : s.toCharArray()){
            if(mapS.containsKey(ch)){
                int a=mapS.get(ch);
                mapS.put(ch,a+1);
            }
            else{
                mapS.put(ch,1);
            }
        }
        for(char ch : t.toCharArray()){
            if(mapT.containsKey(ch)){
                int a=mapT.get(ch);
                mapT.put(ch,a+1);
            }
            else{
                mapT.put(ch,1);
            }
        }
        for(char ch : mapS.keySet()){
            if(mapT.containsKey(ch)){
               if(mapS.get(ch)>mapT.get(ch)) count+=mapS.get(ch)-mapT.get(ch);
            }
            else{
                count+=mapS.get(ch);
            }
        }
        return count;
    }
}