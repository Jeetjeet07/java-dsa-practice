package linked_list;

public class LL {

    private Node head;
    private Node tail;
    private int size;
    public LL() {
        this.size=0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size+=1;
    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }

    public void insert(int val,int index){
        if(index ==0){
            insertFirst(val);
            return;
        }
        if(index ==size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node nnode =  new Node( val,temp.next);
        temp.next=nnode;

        size++;
    }




    public int deleteFirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }


    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;  //tail removed
        tail=secondLast;   //new tail
        tail.next=null;   //link remove

        return val;  //what is removed
    }

    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.value; // removed one
        prev.next = prev.next.next; //link to nextnext
        // (obj &ref change in original)-if exist cant point

        return val;
    }

    public Node find(int value){
        Node node = head; //start search (pointer)
        while(node != null){
            if(node.value == value){  //found
                return node;
            }
            node = node.next; //keep moving
        }
        return node;  //pointer returned
    }

    //Q3 L21
    public static LL merge(LL first,LL second){
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();
        while(f!=null && s!=null){
            if(f.value<s.value){
                ans.insertLast(f.value);
                f=f.next;
            }else{
                ans.insertLast(s.value);
                s=s.next;
            }
        }
        while(f!=null){
            ans.insertLast(f.value);
            f=f.next;
        }
        while(s!=null){
            ans.insertLast(s.value);
            s=s.next;
        }
        return ans;

    }

    //bubble

    //recursion reverse
    private void reverse(Node node){
        if(node==tail){
            head=tail;
            return;
        }
        reverse(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;
    }

    // in place reverse-3pointers
    public void reverse(){
        if(size<2){
            return;
        }
        Node prev = null;
        Node present = head;
        Node next= present.next;

        while(present !=null){
            present.next = prev;
            prev=present;
            present=next;
            if(next !=null){
                next=next.next;
            }
            head=prev;
        }
    }




    public Node get(int index){  //ref of that node
        Node node = head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }

    public void display(){
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.value +"->");
            temp=temp.next;
        }
        System.out.println("END");
    }


    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}
