package tree.que;

import java.util.*;


public class L102_LOT {
    public static void main(String[] args) {
        System.out.println("Hello world");
    }

    //Leetcode 102
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if(root==null)  return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);

            for(int i=0; i<levelSize; i++){
                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.val);
                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
            result.add(currentLevel);
        }

        return result;
    }

    //Q3
    public TreeNode findSuccessor(TreeNode root, int key){
        if(root == null) return null;

        Queue<TreeNode> queue = new LinkedList<>(); //extra space
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();

            TreeNode currentNode = queue.poll();
            //adding children
            if(currentNode.left != null){
                queue.offer(currentNode.left);
            }
            if(currentNode.right != null){
                queue.offer(currentNode.right);
            }

            //check
            if(currentNode.val == key){
                break;
            }
        }
        return queue.peek();
    }
}


