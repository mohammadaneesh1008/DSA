class Solution {
    public int gcd(int a,int b){
        while(b!=0){
            int t=a%b;
            a=b;
            b=t;
        }
        return a;
    }
    public int first(int n){
        while(n>=10) n/=10;
        return n;
    }
    public int countBeautifulPairs(int[] nums){
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(gcd(first(nums[i]),nums[j]%10)==1) count++;
            }
        }
        return count;
    }
}