package tree;

public class Main {
    public static void main(String[] args) {

//        Scanner scn = new Scanner(System.in);
//        BinaryTree tree = new BinaryTree();
//        tree.populate(scn);
////        tree.display();
//        tree.prettyDisplay();

//        BST tree = new BST();
//        int[] nums ={5,67,1,4,3,8,9,4};
//        tree.populate(nums);
//        tree.display();

//        AVL tree = new AVL();
//        for(int i=0; i<100; i++){
//            tree.insert(i);
//        }
//        System.out.println(tree.height());

        int[] arr = {3,8,6,7,-2,-8,4,9};
        SegmentTree tree = new SegmentTree(arr);
//        tree.display();

        System.out.println(tree.query(1,6));
    }
}
