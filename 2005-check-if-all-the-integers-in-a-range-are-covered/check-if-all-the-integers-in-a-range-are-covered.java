class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<ranges.length;i++){
            for(int j=ranges[i][0];j<=ranges[i][1];j++){
                set.add(j);
            }
        }
        for(int k=left;k<=right;k++){
            if(!set.contains(k)){
                return false;
            }
        }
        return true;
    }
}