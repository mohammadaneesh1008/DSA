class Solution {
    public int maximumLengthSubstring(String s) {
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            int a=1;
            HashMap<Character,Integer> map = new HashMap<>();
            map.put(s.charAt(i),1);
            for(int j=i+1;j<s.length();j++){
                if(map.containsKey(s.charAt(j)) && map.get(s.charAt(j))>=2){
                    break;
                }
                else{
                    a++;
                    if(map.containsKey(s.charAt(j))) map.put(s.charAt(j),map.get(s.charAt(j))+1);
                    else map.put(s.charAt(j),1);
                }
            }
            mx=Math.max(mx,a);
        }
        return mx;
    }
}