class Solution {

    void markParents(TreeNode root, Map<TreeNode, TreeNode> map) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();

            if (curr.left != null) {
                map.put(curr.left, curr);
                q.add(curr.left);
            }

            if (curr.right != null) {
                map.put(curr.right, curr);
                q.add(curr.right);
            }
        }
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {

        List<Integer> li = new ArrayList<>();

        // child -> parent
        Map<TreeNode, TreeNode> map = new HashMap<>();
        markParents(root, map);

        Queue<TreeNode> q = new LinkedList<>();
        Map<TreeNode, Boolean> visited = new HashMap<>();

        q.add(target);
        visited.put(target, true);

        int level = 0;

        while (!q.isEmpty()) {

            int size = q.size();

            if (level == k)
                break;

            level++;

            // Process the complete current level
            while (size-- > 0) {

                TreeNode temp = q.poll();

                // Left
                if (temp.left != null && visited.get(temp.left) == null) {
                    q.add(temp.left);
                    visited.put(temp.left, true);
                }

                // Right
                if (temp.right != null && visited.get(temp.right) == null) {
                    q.add(temp.right);
                    visited.put(temp.right, true);
                }

                // Parent
                TreeNode parent = map.get(temp);

                if (parent != null && visited.get(parent) == null) {
                    q.add(parent);
                    visited.put(parent, true);
                }
            }
        }

        while (!q.isEmpty()) {
            li.add(q.poll().val);
        }

        return li;
    }
}