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
    List<Integer> li = new ArrayList<>();
    void helper(TreeNode node,int level) {
        if(node == null) {
            return;
        }

        if(level == li.size()) {
            li.add(node.val);
        }
        helper(node.right, level+1);
        helper(node.left, level+1);

    }
    public List<Integer> rightSideView(TreeNode root) {
        helper(root,0);
        return li;
    }
}