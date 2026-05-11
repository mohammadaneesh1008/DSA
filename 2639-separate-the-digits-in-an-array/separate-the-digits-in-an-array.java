class Solution {
    public void rev(int n , ArrayList<Integer> ans){
        while(n>0){
            ans.add(n%10);
            n=n/10;
        }
    }
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=nums.length-1;i>=0;i--){
            rev(nums[i],ans);
        }
        Collections.reverse(ans);
        int[] a = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            a[i]=ans.get(i);
        }
        return a;
    }
}