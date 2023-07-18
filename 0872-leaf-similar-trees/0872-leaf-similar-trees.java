import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();
        getLeafNodes(root1, leaves1);
        getLeafNodes(root2, leaves2);
        return leaves1.equals(leaves2);
    }
    
    private void getLeafNodes(TreeNode node, List<Integer> leaves) {
        if (node == null)
            return;
        
        if (node.left == null && node.right == null) {
            leaves.add(node.val);
            return;
        }
        
        getLeafNodes(node.left, leaves);
        getLeafNodes(node.right, leaves);
    }
}
