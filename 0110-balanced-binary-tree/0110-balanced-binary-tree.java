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
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true; // An empty tree is considered balanced.
        }

        int right = height(root.right);
        int left = height(root.left);
        if (Math.abs(right - left) > 1) {
            return false;
        }

        // Check the balance of left and right subtrees recursively
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + Math.max(height(root.right), height(root.left));
        }
    }
}
