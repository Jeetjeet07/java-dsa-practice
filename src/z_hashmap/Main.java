package z_hashmap;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Map using hash
//        Map_usingHash map = new Map_usingHash();
        HashMap<String,String> map = new HashMap<>();
        map.put("Mango","King fruits");
        map.put("Apple","sweet red fruit");
        map.put("Litchi","fav fruit");

//        System.out.println(map.get("Apple"));
        System.out.println(map);


//        String name="Kunal";
//        Integer a= 1234;
//
//        //obj class method
//        //int code = name.hashCode();
//        int code = a.hashCode();
//        System.out.println(code);

//        HashMap<String , Integer> map = new HashMap<>();
//        map.put("Kunal",89);
//        map.put("Karan",99);
//        map.put("Kirsh",88);

//        System.out.println(map.get("Karan"));
//        System.out.println(map.getOrDefault("Aprrv",78));

//        System.out.println(map.containsKey("Karan"));


        //TreeMap
        TreeMap<String,Integer> tmap = new TreeMap<>();
        tmap.put("Kunal",89);
        tmap.put("Karan",99);
        tmap.put("Kirsh",88);
//        System.out.println(tmap);

        //HashSet
        HashSet<Integer> set = new HashSet<>();
        set.add(56);
        set.add(34);
        set.add(56);
        set.add(98);
        set.add(45);
        set.add(1);
//        System.out.println(set);
    }



}
