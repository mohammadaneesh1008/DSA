class Solution {
    public int totalMoney(int n) {
        if(n<=7){
            return n*(n+1)/2;
        }
        int a=n/7;
        int sum=28+(28*(a-1));
        for(int i=1;i<a;i++){
            sum+=7*i;
        }
        for(int i=a+1;i<a+1+(n%7);i++){
            sum+=i;
        }
        return sum;
    }
}