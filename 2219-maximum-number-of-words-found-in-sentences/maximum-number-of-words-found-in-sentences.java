class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<sentences.length;i++){
            String[] arr = sentences[i].split(" ");
            max=Math.max(max,arr.length);
        }
        return max;
    }
}