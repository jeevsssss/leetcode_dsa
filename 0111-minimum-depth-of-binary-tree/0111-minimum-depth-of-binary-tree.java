class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        // If the current node is a leaf node, return 1
        if (root.left == null && root.right == null) {
            return 1;
        }

        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);

        // If either left or right subtree is not present, consider the non-null one.
        if (root.left == null || root.right == null) {
            return Math.max(leftDepth, rightDepth) + 1;
        }

        // Both subtrees are present, return the minimum depth + 1
        return Math.min(leftDepth, rightDepth) + 1;
    }
}
