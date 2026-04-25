class Solution {
    public int recursion(int n){
        int a=0;
        while(n>0){
            a+=(n%10)*(n%10);
            n=n/10;
        }
        return a;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (n!=1) {
            if (set.contains(n)) return false;
            set.add(n);
            n=recursion(n);
        }
        return true;
    }
}