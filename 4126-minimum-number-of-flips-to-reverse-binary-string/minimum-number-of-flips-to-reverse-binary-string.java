class Solution {
    public String binary(int n){
        StringBuilder sb = new StringBuilder();
        while(n>0){
            sb.append(n%2);
            n/=2;
        }
        return sb.reverse().toString();
    }
    public int minimumFlips(int n) {
        String s = binary(n);
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=sb.charAt(i)) count++;
        }
        return count;
    }
}