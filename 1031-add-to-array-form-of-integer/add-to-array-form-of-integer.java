class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        int j=num.length-1;
        int carry=0;
        while(j>=0 || k>0){
            int a=0;
            if (j>=0) {
                a=num[j];
                j--;
            }
            int b=k%10;
            k=k/10;
            int sum=a+b+carry;
            ans.add(sum%10);
            carry=sum/10;
        }
        if(carry!=0) ans.add(carry);
        Collections.reverse(ans);        
        return ans;
    }
}