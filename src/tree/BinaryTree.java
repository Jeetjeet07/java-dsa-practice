package tree;

import java.util.Scanner;

public class BinaryTree {

    public BinaryTree() {
    }

    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    //insert elements-populate ftn
    public void populate(Scanner scn){
        System.out.println("Enter the root Node: ");
        int value = scn.nextInt();

        root=new Node(value);
        populate(scn,root);

    }

    private void populate(Scanner scn, Node node) {

        System.out.println("Do you want to enter left of "+ node.value);
        boolean left=scn.nextBoolean();
        if(left){
            System.out.println("enter the value of left"+ node.value);
            int value = scn.nextInt();
            node.left = new Node(value);
            populate(scn,node.left);

        }

        System.out.println("Do you want to enter right of "+ node.value);
        boolean right=scn.nextBoolean();
        if(right){
            System.out.println("enter the value of right"+ node.value);
            int value = scn.nextInt();
            node.right = new Node(value);
            populate(scn,node.right);

        }
    }

    public void display(){
        display(root,"");
    }
    private void display(Node node, String indent){
        if(node == null) return;
        System.out.println(indent + node.value);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");
    }

    public void prettyDisplay(){
        prettyDisplay(root,0);
    }
    private void prettyDisplay(Node node, int level){
        if(node==null) return;

        //printing rightmost first
        prettyDisplay(node.right,level+1);

        if(level !=0){
            for(int i=0; i< level-1;i++){
                System.out.print("|\t\t");
            }
            System.out.println("|----->"+node.value);

        }else{
            System.out.println(node.value);
        }

        //left
        prettyDisplay(node.left,level+1);
    }

    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.value+" ");
        inOrder(node.right);
    }

    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value+" ");
    }



}

















