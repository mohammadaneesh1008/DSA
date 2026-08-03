class Solution {
    public boolean checkString(String s) {
        int i=0;
        while(i<s.length() && s.charAt(i)=='a') i++;
        if(i==s.length()) return true;
        else{
            int j=i+1;
            while(j<s.length()){
                if(s.charAt(j++)=='a') return false;
            }
        }
        return true;
    }
}