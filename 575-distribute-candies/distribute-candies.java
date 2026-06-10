class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        for(int x : candyType){
            set.add(x);
        }
        if(set.size()>=(candyType.length/2)){
            return candyType.length/2;
        }
        return set.size();
    }
}