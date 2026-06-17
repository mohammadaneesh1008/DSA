class Solution {
    public boolean base(int n, int b){
        StringBuilder sb = new StringBuilder();
        while(n>0){
            sb.append(n%b);
            n/=b;
        }
        StringBuilder newString = new StringBuilder(sb);
        if(!sb.toString().equals(newString.reverse().toString())){
            return true;
        }
        return false;
    }
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<=(n-2);i++){
            if(base(n,i)==true){
                return false;
            }
        }
        return true;
    }
}