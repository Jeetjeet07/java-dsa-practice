package LinkedList;

public class MainDC {
    public static void main(String[] args) {

//        DLL list = new DLL();
//        list.insertFirst(3);
//        list.insertFirst(4);
//        list.insertFirst(6);
//        list.insertFirst(8);
//        list.insertLast(17);
//        list.insertAf(17,19);
//
//        list.display();
//        list.displayRev();

        CLL list = new CLL();
        list.insert(8);
        list.insert(5);
        list.insert(4);
        list.insert(3);

        list.display();
        list.delete(5);
        list.display();
    }
}
