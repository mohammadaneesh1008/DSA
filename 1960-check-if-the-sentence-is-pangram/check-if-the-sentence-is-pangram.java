class Solution {
    public boolean checkIfPangram(String s) {
        int[] ans = new int[26];
        for(char ch : s.toCharArray()){
            ans[ch-'a']++;
        }
        for(int i=0;i<26;i++) if(ans[i]==0) return false;
        return true;
    }
}