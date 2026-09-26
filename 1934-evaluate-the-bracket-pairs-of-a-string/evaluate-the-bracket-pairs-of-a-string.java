class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder sb = new StringBuilder();
        Map<String,String> map = new HashMap<>();
        for(int k=0;k<knowledge.size();k++){
                    List<String> a = knowledge.get(k);
                    map.put(a.get(0),a.get(1));
                }
        int i=0,j=0;
        while(i<s.length()){
            if(s.charAt(i)=='('){
                j=i;
                while(i<s.length() && s.charAt(i)!=')') i++;
                // int f=0;
                // for(int k=0;k<knowledge.size();k++){
                //     List<String> a = knowledge.get(k);
                //     if(a.get(0).equals(s.substring(j+1,i))){
                //          sb.append(a.get(1));
                //          f=1;
                //          break;
                //     }
                // }
                // if(f==0) sb.append('?');
                if(map.containsKey(s.substring(j+1,i))) sb.append(map.get(s.substring(j+1,i)));
                else sb.append('?');
                i++;
            }
            else sb.append(s.charAt(i++));  
        }
        return sb.toString();
    }
}