class Solution {
    public int minOperations(String s) {
        int max=0;
        for(char x : s.toCharArray()){
            if(x!='a') max=Math.max(max,26-(x-'a'));
        }
        return max;
    }
}