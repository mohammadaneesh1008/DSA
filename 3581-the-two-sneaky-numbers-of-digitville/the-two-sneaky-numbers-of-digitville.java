class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] ans = new int[2];
        int i=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : nums){
            if(map.containsKey(x)){
                int a=map.get(x);
                if(a+1==2) ans[i++]=x;
                map.put(x,a+1);
            }
            else{
                map.put(x,1);
            }
        }
        return ans;
    }
}