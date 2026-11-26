class Solution {
    public boolean canAliceWin(int n) {
        int a=10;
        int ans=0;
        while(n>=a){
            n-=a;
            a--;
            ans++;
        }
        if(ans%2==1) return true;
        return false;
    }
}