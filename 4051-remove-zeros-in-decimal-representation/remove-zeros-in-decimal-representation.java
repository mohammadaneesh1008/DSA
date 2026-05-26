class Solution {
    public long removeZeros(long n) {
        long ans=0;
        String s = n+"";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0'){
                ans=ans*10+(s.charAt(i)-'0');
            }
        }
        return ans;
    }
}