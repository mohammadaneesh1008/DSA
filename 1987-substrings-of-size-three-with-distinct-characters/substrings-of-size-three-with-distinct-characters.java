class Solution {
    public int countGoodSubstrings(String s) {
    int count=0;
    int i=0;
    while(i<s.length()-2){
        if((s.charAt(i)!=s.charAt(i+1)) && (s.charAt(i+1)!=s.charAt(i+2)) && (s.charAt(i)!=s.charAt(i+2))) count++;
        i++;
    }
    return count;
    }
}