class Solution {
    public String truncateSentence(String s, int k) {
        int sp=0;
        int i=0;
        while(i<s.length() && sp!=k){
            if(s.charAt(i)==' ') sp++;
            i++;
        }
        if(i!=s.length()) return s.substring(0,i-1);
        return s.substring(0,i);
    }
}