class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int ans=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : nums){
            if(map.containsKey(x)) map.put(x,map.get(x)+1);
            else map.put(x,1);
        }
        for(int x : nums){
            if(map.get(x)%k==0) ans+=x;
        }
        return ans;
    }
}