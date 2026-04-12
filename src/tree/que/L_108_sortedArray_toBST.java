package tree.que;

public class L_108_sortedArray_toBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        return convert(nums,0,nums.length);
    }

    private  TreeNode convert(int[] nums, int start, int end) {
        if (start >= end) {  //excluded end
            return null;
        }

        int mid = start + (end - start) / 2;

        TreeNode node = new TreeNode(nums[mid]);
        node.left=convert(nums, start, mid);
        node.right=convert(nums, mid + 1, end);

        return node;
    }
}
