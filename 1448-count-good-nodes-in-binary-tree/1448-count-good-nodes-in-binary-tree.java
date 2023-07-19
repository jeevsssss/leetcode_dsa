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
    int count=0;
    public int goodNodes(TreeNode root) {
        int max=Integer.MIN_VALUE;
        if(root==null)
        {
            return count;
        }
        goodcount(root,max);
        return count;
    }
    public void goodcount(TreeNode root,int max)
    {
        if(root==null)
        {
            return;
        }
        if(root.val>=max)
        {
            count++;
            max=root.val;
        }
        goodcount(root.left,max);
        goodcount(root.right,max);
    }
}