package linked_list;

public class Main {


    public static void main(String[] args) {
        //in-built
//        LinkedList<Integer> list = new LinkedList<>();
//        list.add(34);

//        //internal-actual
//        LL list = new LL();
//        list.insertFirst(3);
//        list.insertFirst(4);
//        list.insertFirst(6);
//        list.insertFirst(8);
//        list.insertLast(72);
//        list.insert(5,2);

//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.delete(2));
//        list.display();


        //merge
        LL first = new LL();
        LL second = new LL();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        first.insertLast(1);
        first.insertLast(2);
        first.insertLast(9);
        first.insertLast(14);

        LL ans = LL.merge(first,second);
        ans.display();
    }


}
