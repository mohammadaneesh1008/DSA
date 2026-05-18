class Solution {
    public int getLeastFrequentDigit(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int mn=Integer.MAX_VALUE;
        while(n>0){
            int a=n%10;
            if(map.containsKey(a)){
                int b=map.get(a);
                map.put(a,b+1);
            }
            else{
                map.put(a,1);
            }
            n=n/10;
        }
        for(int x : map.values()){
            mn=Math.min(mn,x);
        }
        int ans=Integer.MAX_VALUE;
        for(int x : map.keySet()){
            if(map.get(x)==mn){
                ans=Math.min(ans,x);
            }
        }
        return ans;
    }
}