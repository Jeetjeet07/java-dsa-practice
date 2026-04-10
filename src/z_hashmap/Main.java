package z_hashmap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
//        String name="Kunal";
//        Integer a= 1234;
//
//        //obj class method
//        //int code = name.hashCode();
//        int code = a.hashCode();
//        System.out.println(code);

        HashMap<String , Integer> map = new HashMap<>();
        map.put("Kunal",89);
        map.put("Karan",99);
        map.put("Kirsh",88);

        System.out.println(map.get("Karan"));
    }

}
