class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> ans = new ArrayList<>();
        for(int i=0;i<queries.length;i++){
            String s = queries[i];
            for(int j=0;j<dictionary.length;j++){
                String a=dictionary[j];
                int edit=0;
                for(int k=0;k<a.length();k++){
                    if(a.charAt(k)!=s.charAt(k)){
                        edit++;
                        if(edit>2) break;
                    }
                }
                if(edit<=2){
                    ans.add(s);
                    break;
                }
            }
        }
        return ans;
    }
}