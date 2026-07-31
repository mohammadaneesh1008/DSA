class Solution {
    public int minimumPushes(String word) {
      HashMap<Character,Integer> map = new HashMap<>();
      for(char ch : word.toCharArray()){
        if(map.containsKey(ch)) map.put(ch,map.get(ch)+1);
        else map.put(ch,1);
      }  
      ArrayList<Integer> ans = new ArrayList<>();
      for(int x : map.values()) ans.add(x);
      Collections.sort(ans);
      Collections.reverse(ans);
      int k=1;
      int count=0;
      for(int i=0;i<ans.size();i+=8){
        int j=i;
        int sum=0;
        while(j<ans.size() && j<i+8){
            sum+=ans.get(j++);
        }
        count+=(sum*k);
        k++;
      }
      return count;
    }
}