package tree.que;

public class L114_flattenBT_toLL {
    public void flatten(TreeNode root) {

        TreeNode curr = root;
        while(curr != null){
            if(curr.left !=null){
                TreeNode temp = curr.left;
                while(temp.right != null){
                    temp=temp.right; //keep going right
                }

                temp.right=curr.right;
                curr.right = curr.left;
                curr.left=null;
            }
            curr=curr.right;
        }
    }
}
