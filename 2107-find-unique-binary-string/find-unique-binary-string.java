class Solution {
    public String binary(int i , int n){
            StringBuilder sb = new StringBuilder();
            while(i>0){
                sb.append(i%2);
                i/=2;
            }
            while(sb.length()<n){
                sb.append(0);
            }
            return sb.reverse().toString();
    }
    public String findDifferentBinaryString(String[] nums) {
        HashSet<String> set = new HashSet<>();
        for(String s : nums){
            set.add(s);
        }
        int n=1;
        for(int i=1;i<=nums.length;i++) n*=2;
        n--;
        for(int i=0;i<=n;i++){
            String b=binary(i,nums.length);
            if(!set.contains(b)) return b;
        }
        return "";
    }
}