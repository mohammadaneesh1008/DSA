class Solution {
    public int myAtoi(String s) {
        long ans=0;
        int i=0;
        int sign=1;
        while(i<s.length() && s.charAt(i)==' ') i++;
        if(i==s.length()) return 0;
        if(s.charAt(i)=='-'){ sign=-1;i++;}
        else if(s.charAt(i)=='+') i++;
        while(i<s.length() && ((int)(s.charAt(i))>=48 && (int)(s.charAt(i))<=57)){
            ans=ans*10+(s.charAt(i)-'0');
            if(sign==1 && ans>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(sign==-1 && -ans<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }
        if(sign==-1) return (int)(sign*ans);
        return (int)(ans);
    }
}