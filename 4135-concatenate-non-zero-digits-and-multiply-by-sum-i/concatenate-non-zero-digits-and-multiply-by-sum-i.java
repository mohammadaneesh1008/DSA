class Solution {

    public long sumAndMultiply(int n) {
        long sum=0;
        long mul=0;
        while(n>0){
                int r=n%10;
                if(r!=0) mul=mul*10+r;
                sum+=r;
                n/=10;
        }
        long x=0;
        while(mul>0){
                x=x*10+mul%10;
                mul/=10;
        }
        return sum*x;
    }
}