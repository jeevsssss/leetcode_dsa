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
public class Solution {
    
    int minDiff = Integer.MAX_VALUE;
    TreeNode temp;
    
    public int getMinimumDifference(TreeNode root)
    {
        inorder(root);
        return minDiff;
    }
    
    public void inorder(TreeNode root)
    {
        if (root == null)
        {
            return;
        }
        inorder(root.left);
        if (temp != null)
        {
            minDiff = Math.min(minDiff, root.val - temp.val);
        }
        temp = root;
        inorder(root.right);
    }

}