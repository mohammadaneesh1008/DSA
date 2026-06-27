class Solution {
    public boolean judgeSquareSum(int c) {
        if(c==0) return true;
        long a=0;
        long b=(long) Math.sqrt(c);
        while(a<=b){
            long s=a*a+b*b;
            if(s==c) return true;
            else if(s<c) a++;
            else b--;
        }
        return false;
    }
}