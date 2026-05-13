class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        for(char ch : s.toCharArray()){
                if(map1.containsKey(ch)){
                    int a = map1.get(ch);
                    map1.put(ch,a+1);
                }
                else{
                    map1.put(ch,1);
                }
        }
        int mxv=0;
        int mxc=0;
        for(char ch : map1.keySet()){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                mxv=Math.max(mxv,map1.get(ch));
            }
            else{
                mxc=Math.max(mxc,map1.get(ch));
            }
        }
        return mxv+mxc;
    }
}