class Solution {
    public void inorder(TreeNode root, List<TreeNode> arr){
        if(root == null) return;
        inorder(root.left, arr);
        arr.add(root);
        inorder(root.right, arr);
    }
    public void recoverTree(TreeNode root) {
        List<TreeNode> arr = new ArrayList<>();
        inorder(root, arr);
        TreeNode first = null;
        TreeNode second = null;
        for(int i=1;i<arr.size();i++){
            if(arr.get(i).val<arr.get(i-1).val){
                if(first==null){
                    first=arr.get(i-1);
                }
                second=arr.get(i);
            }
        }
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
}