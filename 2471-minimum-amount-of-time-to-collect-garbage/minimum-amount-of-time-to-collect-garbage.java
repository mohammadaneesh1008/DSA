class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int g=0,m=0,p=0;
        int gidx=-1,midx=-1,pidx=-1;
        for(int i=0;i<garbage.length;i++){
            String s=garbage[i];
                for(char c:s.toCharArray()){
                    if(c=='G'){
                        g++;
                        gidx=i;
                    }
                    else if(c=='M'){
                        m++;
                        midx=i;
                    }
                        else{
                            p++;
                            pidx=i;
                        }
            }
        }
        for(int i=1;i<travel.length;i++){
            travel[i]+=travel[i-1];
        }
        int ans=g+m+p;
        if(gidx>0) ans+=travel[gidx-1];
        if(midx>0) ans+=travel[midx-1];
        if(pidx>0) ans+=travel[pidx-1];
        return ans;
    }
}