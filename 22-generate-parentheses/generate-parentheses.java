class Solution {
    static ArrayList<String> arr;
     static void printParentheses(int open, int close, int n, String ans) {
        if (ans.length() == 2 * n) {
            arr.add(ans);
            return;
        }
        if (open < n) {
            printParentheses(open + 1, close, n, ans + "(");
        }
        if (close < open) {
            printParentheses(open, close + 1, n, ans + ")");
        }
    }
    public List<String> generateParenthesis(int n) {
        arr = new ArrayList<>();
        printParentheses(0,0,n,"");
        return arr;
    }
}