class Solution {
    public String reversePrefix(String s, char ch) {
        int i=0;
        while(i<s.length() && s.charAt(i)!=ch) i++;
        if(i==s.length()) return s;
        StringBuilder sb = new StringBuilder(s.substring(0,i+1));
        sb.reverse();
        sb.append(s.substring(i+1,s.length()));
        return sb.toString();
    }
}