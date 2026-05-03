class Solution {
    public boolean rotateString(String s, String goal) {
        String a = s;
        for(int i=0;i<s.length();i++){
            if(a.equals(goal)){
                return true;
            }
            a=s.substring(i+1)+s.substring(0,i+1);
        }
        return false;
    }
}