class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int i=0;
        int j=0;
        int unsatisfied=0;
        while(j<customers.length && j<minutes){
            if(grumpy[j]==1) unsatisfied+=customers[j];
            j++;
        }
        j--;
        int max=0;
        int a=0,b=0;
        while(j<customers.length){
            if(unsatisfied>max){
                a=i;
                b=j;
                max=unsatisfied;
            }
            i++;
            j++;
            if(j<customers.length && grumpy[j]==1){
                unsatisfied+=customers[j];
            }
            if(grumpy[i-1]==1){
                unsatisfied-=customers[i-1];
            }
        }
        for(int p=a;p<=b;p++){
            grumpy[p]=0;
        }
        int ans=0;
        for(int p=0;p<grumpy.length;p++){
            if(grumpy[p]==0){
                ans+=customers[p];
            }
        }
        return ans;
    }
}