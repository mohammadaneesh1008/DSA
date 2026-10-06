class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums2.length;i++) map.put(nums2[i],i);
        for(int i=0;i<nums1.length;i++){
            int a=nums1[i];
            for(int j=map.get(a)+1;j<nums2.length;j++){
                if(nums2[j]>a){
                    nums1[i]=nums2[j];
                    a=-1;
                    break;
                }
            }
            if(a!=-1) nums1[i]=-1;
        }
        return nums1;
    }
}