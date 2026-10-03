class Solution {
    public boolean check(int n){
        if(n<2) return false;
        if(n==2) return true;
        for(int i=2;i<=(Math.sqrt(n));i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public int sumOfPrimesInRange(int n) {
        int num=n;
        int rev=0;
        while(num>0){
            rev=rev*10+num%10;
            num/=10;
        }
        int ans=0;
        for(int i=Math.min(n,rev);i<=Math.max(n,rev);i++){
                if(check(i)==true) ans+=i;
        }
        return ans;
    }
}