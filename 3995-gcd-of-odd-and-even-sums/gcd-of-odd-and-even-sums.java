class Solution {
    public int gcd(int a, int b){
         while (b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public int gcdOfOddEvenSums(int n) {
        int oddsum=0;
        int evensum=0;
        int i=0;
        int odd=1;
        int even=0;
        while(i<n){
            oddsum+=odd;
            odd+=2;
            evensum+=even;
            even+=2;
            i++;
        }
        return gcd(oddsum,evensum);
    }
}