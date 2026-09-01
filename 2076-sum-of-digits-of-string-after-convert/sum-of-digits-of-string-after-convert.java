class Solution {
    public int getLucky(String s, int k) {
        int num=0;
        for(char ch : s.toCharArray()){
            int a=ch-'a'+1;
            while(a>0){
                num+=a%10;
                a/=10;
            }
        }
        while(k-1>0){
            int sum=0;
            int a=num;
            while(a>0){
                sum+=a%10;
                a/=10;
            }
            num=sum;
            k--;
        }
        return num;
    }
}