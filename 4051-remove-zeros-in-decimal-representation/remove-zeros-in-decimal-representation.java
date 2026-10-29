class Solution {
    public long removeZeros(long n) {
        String s = n+"";
        s=s.replace("0","");
        return Long.parseLong(s);
    }
}