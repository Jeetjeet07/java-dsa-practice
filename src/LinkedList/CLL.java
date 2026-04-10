package LinkedList;

public class CLL {
    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val){
        Node node = new Node(val);
        if(head ==null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }

    public void delete(int val){
        Node node =head;
        // check empty
        if(node == null){
            return;
        }

        //check on head
        if(node.val ==  val){
            head=head.next;
            tail.next=head;
            return;
        }
        //check further
        do{
            Node n = node.next;
            if(n.val == val){
                node.next = n.next; //skip n
                break;
            }
            node=node.next; //if not move further
        }while(node != head); //until once cycle completed
    }

    public void display(){
        Node node = head;
        if(head != null){
            do{
                System.out.print(node.val +" -> ");
                node=node.next;
            }while(node != head);
        }
        System.out.println("head");
    }

    private class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
