class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int increment=0;
        int decrement=0;
        for(String s : operations){
            if(s.equals("X++") || s.equals("++X")) increment++;
            else decrement++;
        }
        return increment-decrement;
    }
}