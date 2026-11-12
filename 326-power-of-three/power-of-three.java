class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0) return false;
        if(n==1) return true;
        for(long i=3;i<=(long)n;i=i*3){
            if(i==(long)n ) return true;
        }
        return false;
    }
}