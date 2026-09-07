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
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        TreeNode l_ptr = root, r_ptr = root;
        int h = 0;

        while(l_ptr != null && r_ptr != null) {
            l_ptr = l_ptr.left;
            r_ptr = r_ptr.right;
            h++;
        }

        if(l_ptr == r_ptr) {
            return (int)Math.pow(2,h) - 1;
        }

        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}