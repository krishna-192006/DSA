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
    class Pair{
        TreeNode node;
        int lvl;
        Pair(TreeNode node,int lvl) {
            this.node = node;
            this.lvl = lvl;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null ) return 0;
        int ans = 0;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));

        while(!q.isEmpty()) {
            int size = q.size();
            int temp = q.peek().lvl;
            int first = 0, last = 0;

            for(int i=0;i<size;i++) {
                int curr = q.peek().lvl-temp;
                TreeNode Node = q.peek().node;
                q.poll();

                if(i==0) first = curr;
                if(i == size-1) last = curr;
                if(Node.left != null ) {
                    q.add(new Pair(Node.left,curr*2 + 1));
                }

                if(Node.right != null) {
                    q.add(new Pair(Node.right,curr*2 + 2));
                }
            }
            ans = Math.max(ans,last-first+1);
        }
        return ans;
    }
}