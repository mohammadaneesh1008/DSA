class Solution {
    public boolean check(int n){
        if(n<2) return false;
        if(n==2) return true;
        for(int i=2;i<=(int)(Math.sqrt(n));i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public int maximumPrimeDifference(int[] nums) {
        boolean first=false;
        boolean last=false;
        int f=0;
        int l=0;
        for(int i=0;i<nums.length;i++){
            if(check(nums[i])==true && first==false){first=true;f=i;l=i;}
            else if(check(nums[i])==true && first==true) l=i;
        }
        return (l-f);
    }
}