class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            if((int)(arr[i])<65 || ((int)(arr[i])<97 && (int)(arr[i])>90)) i++;
            else if((int)(arr[j])<65 || ((int)(arr[j])<97 && (int)(arr[j])>90)) j--;
            else{
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int k=0;k<arr.length;k++) sb.append(arr[k]);
        return sb.toString();
    }
}