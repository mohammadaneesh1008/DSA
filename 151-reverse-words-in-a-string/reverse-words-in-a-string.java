class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        StringBuilder ans = new StringBuilder();
        int i=s.length(),j=s.length()-1;
        while(j>=0 && i>=0){
            while(j>=0 && s.charAt(j)==' ') j--;
            i=j;
            while(j>=0 && s.charAt(j)!=' ') j--;
            ans.append(s.substring(j+1, i+1)).append(" ");
        } 
        return ans.toString().trim();
    }
}