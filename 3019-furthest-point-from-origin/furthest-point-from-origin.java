class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int L=0;
        int R=0;
        int U=0;
        for(char ch : moves.toCharArray()){
            if(ch=='L') L++;
            else if(ch=='_') U++;
            else R++;
        }
        return Math.abs(L-R)+U;
    }
}