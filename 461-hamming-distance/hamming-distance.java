class Solution {
    public int hammingDistance(int x, int y) {
        int a=(x^y);
        String s=Integer.toBinaryString(a);
        int ans=0;
        for(int i=0;i<s.length();i++) if(s.charAt(i)=='1') ans++;
        return ans;
    }
}