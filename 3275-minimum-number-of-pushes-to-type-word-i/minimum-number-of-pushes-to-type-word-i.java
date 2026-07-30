class Solution {
    public int minimumPushes(String s) {
       if(s.length()<=8) return s.length();
       int a=s.length()/8;
       int b=s.length()%8;
       int sum=0;
       for(int i=1;i<=a;i++){
        sum+=(i*8);
       }
       sum+=(b)*(a+1);
       return sum;
    }
}