package tree.que;
import java.util.*;

public class L103_Zigzag {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        if(root==null)  return result;

        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);  //root node in

        boolean reverse =false;

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);

            for(int i=0; i<levelSize; i++){

                if(!reverse){
                    TreeNode currentNode = queue.pollFirst();  //remove first
                    currentLevel.add(currentNode.val);   //add back
                    if(currentNode.left != null){
                        queue.addLast(currentNode.left);
                    }
                    if(currentNode.right != null){
                        queue.addLast(currentNode.right);
                    }

                }else{
                    TreeNode currentNode = queue.pollLast();
                    currentLevel.add(currentNode.val);
                    if(currentNode.right != null){  //above due to reverse
                        queue.addFirst(currentNode.right);
                    }
                    if(currentNode.left != null){
                        queue.addFirst(currentNode.left);
                    }

                }
            }
            reverse= !reverse;
            result.add(currentLevel);
        }

        return result;

    }
}
