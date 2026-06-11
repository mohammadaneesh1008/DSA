class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] ans = new int[num_people];
        int i=0;
        int j=1;
        while(candies>j){
            ans[i%num_people]+=j;
            candies-=j;
            j++;
            i++;
        }
        ans[i%num_people]+=candies;
        return ans;
    }
}