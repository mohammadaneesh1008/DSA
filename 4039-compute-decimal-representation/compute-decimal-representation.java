class Solution {
    public int[] decimalRepresentation(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        int place=1;
        while(n>0){
            int a=n%10;
            if(a*place!=0) ans.add(a*place);
            place*=10;
            n=n/10;
        }
        int[] a = new int[ans.size()];
        int j=0;
        for(int i=ans.size()-1;i>=0;i--){
            a[j++]=ans.get(i);
        }
        return a;
    }
}