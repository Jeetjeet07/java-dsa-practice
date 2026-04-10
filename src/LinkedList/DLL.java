package LinkedList;

public class DLL {
    private Node head;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head=node;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node last=head;  //pointer

        node.next = null;  //end node
        if(head == null){   //empty
            node.prev = null;
            head=node;   //single node LL
            return;
        }

        while(last.next !=null){   //last node find
            last=last.next;
        }
        last.next = node;   //insert at end
        node.prev=last;     //link rev
    }

    public void insertAf(int afterN,int val){
        Node p = find(afterN);

        if(p == null){   //N dont exist
            System.out.println("not exist");
            return;
        }

        Node node = new Node(val);
        node.next=p.next;
        node.prev =p;
        p.next=node;
        if(node.next != null){   // can be last
            node.next.prev = node;
        }
    }

    public Node find(int value){
        Node node = head;

        while(node != null){
            if(node.val==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }

    public void display(){
        Node node = head;
        while(node != null){
            System.out.print(node.val + " -> ");
            node=node.next;
        }
        System.out.println( "END");
    }

    public void displayRev(){
        Node node = head;
        Node last = null;

        while(node != null) {  //finding last
//            System.out.print();
            last = node;
            node = node.next;
        }
//        System.out.println("end");

//        System.out.println("print rev");
        while (last != null) {
            System.out.print(last.val + " >- ");
            last = last.prev;
        }
        System.out.println("START");
    }

    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

}
