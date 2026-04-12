package tree.que;

public class L_104_maxDepthBT {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        
        int left= maxDepth(root.left);
        int right= maxDepth(root.right);
        
        return Math.max(left,right)+1;

    }
}
