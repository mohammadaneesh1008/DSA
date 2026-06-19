/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void inOrder(TreeNode root, ArrayList<Integer> ans){
        if(root==null) return;
        inOrder(root.left,ans);
        ans.add(root.val);
        inOrder(root.right,ans);
    }
    public boolean isValidBST(TreeNode root) {
       ArrayList<Integer> ans = new ArrayList<>();
       inOrder(root,ans);
       for(int i=1;i<ans.size();i++){
        if(ans.get(i)<=ans.get(i-1)) return false;
       }
       return true;
    }
}