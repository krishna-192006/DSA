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
    public List<Integer> inorderTraversal(TreeNode root) {
    // using stack
    Stack<TreeNode> st = new Stack<>();
    // st.push(root.val);
    TreeNode node = root;
    while(true) {
        if(node != null) {
            st.push(node);
            node = node.left;
        } else {
            if(st.isEmpty()) {
                break;
            }
            node = st.pop();
            li.add(node.val);
            node = node.right;
        }
    }
    return li;

    //  Iterative traversal
    //     if(root == null) {
    //         return li;
    //     }
    //     inorderTraversal(root.left);
    //     li.add(root.val);
    //     inorderTraversal(root.right);
    // return li;
    }
}