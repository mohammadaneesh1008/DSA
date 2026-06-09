class Solution {
    public String customSortString(String order, String s) {
        StringBuilder sb = new StringBuilder();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            if(map.containsKey(ch)){
                int a = map.get(ch);
                map.put(ch,a+1);
            }
            else{
                map.put(ch,1);
            }
        }
        for(int i=0;i<order.length();i++){
            if(map.containsKey(order.charAt(i))){
                int p = map.get(order.charAt(i));
                while(p-->0){
                    sb.append(order.charAt(i));
                }
            }
        }
        for(char ch : map.keySet()){
            if(!order.contains(ch+"")){
                int p = map.get(ch);
                while(p-->0){
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}