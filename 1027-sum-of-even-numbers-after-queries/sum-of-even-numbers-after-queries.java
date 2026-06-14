class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] ans = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            nums[queries[i][1]]=nums[queries[i][1]]+queries[i][0];
            int sum=0;
            for(int x : nums){
            if(x%2==0){
                sum+=x;
            }
          }
          ans[i]=sum;
        }
        return ans;
    }
}