class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] ans = new int[A.length];
        for(int i=0;i<A.length;i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j=0;j<=i;j++){
                set.add(A[j]);
                set.add(B[j]);
            }
            ans[i]=((i+1)*2-set.size());
        }
        return ans;
    }
}