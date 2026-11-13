class Solution {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        if(num<0){
            num=num*(-1);
            StringBuilder ans = new StringBuilder();
                while(num!=0){
                            ans.append(num%7);
                            num=num/7;
                             }
            ans.append("-");
            return ans.reverse().toString();
        }
        StringBuilder ans = new StringBuilder();
        while(num!=0){
            ans.append(num%7);
            num=num/7;
        }
        return ans.reverse().toString();
    }
}