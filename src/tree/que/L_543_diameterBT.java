package tree.que;

//TC- O(N)
//SC- O(H)
public class L_543_diameterBT {
    int dia=0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return dia-1;
    }

    int  height(TreeNode node ){
        if(node == null) return 0 ;

        int leftHeight=height(node.left);
        int rightHeight=height(node.right);

        int diameter=leftHeight+rightHeight+1;
        dia=Math.max(dia,diameter);

        return Math.max(leftHeight,rightHeight)+1;
    }

}
