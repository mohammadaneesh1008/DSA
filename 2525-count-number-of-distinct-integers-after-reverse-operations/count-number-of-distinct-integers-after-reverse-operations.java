class Solution {
    public int reverse(int n){
        int rev=0;
        while(n>0){
            rev=rev*10+n%10;
            n/=10;
        }
        return rev;
    }
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums){
            set.add(x);
            set.add(reverse(x));
        }
        return set.size();
    }
}