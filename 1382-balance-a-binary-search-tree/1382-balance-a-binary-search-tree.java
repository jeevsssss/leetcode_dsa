class Solution {
    List<Integer> sortedArray = new ArrayList();
    public TreeNode balanceBST(TreeNode root)
    {
        inorder(root);
        return construct(0, sortedArray.size()-1);
    }
    
    private TreeNode construct(int start, int end)
    {
        if(start>end)
        {
            return null;
        }
        int mid = (end+start)/2;
        TreeNode root = new TreeNode(sortedArray.get(mid));
        root.left = construct(start, mid - 1);
        root.right = construct(mid+1, end);
        return root;
    }
    
    private void inorder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        sortedArray.add(root.val);
        inorder(root.right);
    }
}