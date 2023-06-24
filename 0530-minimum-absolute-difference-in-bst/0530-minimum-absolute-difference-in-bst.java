class Solution {
  int prev = -100000, min = 100000;

  public int getMinimumDifference(TreeNode node) {
    if (node == null) return min;

    getMinimumDifference(node.left);
    min = Math.min(min, node.val - prev);
    prev = node.val;
    getMinimumDifference(node.right);

    return min;
  }
}