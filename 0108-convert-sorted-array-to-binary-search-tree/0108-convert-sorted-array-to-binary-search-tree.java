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
class Solution 
{
    public TreeNode sortedArrayToBST(int[] nums)
    {
        if (nums.length == 0)
        {
			return null;
        }
		return arrange(nums, 0, nums.length - 1);
	}
	public TreeNode arrange(int[] nums, int beg, int end) 
    {
		if (beg > end)
        {
			return null;
        }
		int mid = (beg + end) / 2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = arrange(nums, beg, mid - 1);
		root.right = arrange(nums, mid + 1, end);
		return root;
    }
}