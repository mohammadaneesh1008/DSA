class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int ans=0;
        for(int i=0;i<fruits.length;i++){
            int f=0;
            for(int j=0;j<fruits.length;j++){
                if(fruits[i]<=baskets[j]){
                    f=1;
                    baskets[j]=0;
                    break;
                }
            }
            if(f==0) ans++;
        }
        return ans;
    }
}