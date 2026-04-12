package tree.que;

public class L_226_invertBT {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }

        TreeNode left=invertTree(root.left);
        TreeNode right=invertTree(root.right);

        //swap
        root.left=right;
        root.right=left;

        return root;
    }
}
