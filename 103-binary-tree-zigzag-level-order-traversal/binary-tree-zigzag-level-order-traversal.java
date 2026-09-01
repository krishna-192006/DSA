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
    List<List<Integer>> li = new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        boolean leftToRight = true; // L to R -> true                 // R to L -> false;
        if(root == null) return li;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            int size = q.size();
            List<Integer> temp = new ArrayList<>();

            for(int i=0;i<size;i++) {
                TreeNode node = q.poll();
                temp.add(node.val);
        
                if(node.left != null) {
                    q.add(node.left);
                }

                if(node.right != null) {
                    q.add(node.right);
                }
            } 

            if(!leftToRight) {
                Collections.reverse(temp);
            }
            li.add(temp);
            leftToRight = !leftToRight;
        }
    return li;
    }
}