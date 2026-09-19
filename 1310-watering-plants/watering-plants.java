class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int ans=0;
        int curr=capacity;
        for(int i=0;i<plants.length;i++){
            if(plants[i]<=curr){ ans++;curr-=plants[i];}
            else{
                ans+=i;
                ans+=i+1;
                curr=capacity;
                curr-=plants[i];
            }
        }
        return ans;
    }
}