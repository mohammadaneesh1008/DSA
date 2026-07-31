class Solution {
    public int binary(int n){
        int count=0;
        while(n>0){
            if(n%2==1) count++;
            n/=2;
        }
        return count;
    }
    public int hammingWeight(int n) {
        return binary(n);
    }
}