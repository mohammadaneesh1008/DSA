class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int x:nums){
            pq.add(x);
            if(pq.size()>k) pq.remove();
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        while(!pq.isEmpty()){
            int x=pq.remove();
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }
            else{
                map.put(x,1);
            }
        }
        int[] ans=new int[k];
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(i<k && map.containsKey(nums[j]) && map.get(nums[j])>0){
                ans[i++]=nums[j];
                map.put(nums[j],map.get(nums[j])-1);
            }
        }
        return ans;
    }
}