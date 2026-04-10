package recursion.basics;

public class Main {
    public static void main(String[] args) {
        // function that print hello world
        message();

    }

    // multiple prints in one call - ftn calling ftn
    static void message(){
        System.out.println("hello World");
        m1();
    }
    static void m1(){
        System.out.println("Hello world");
        m2();
    }
    static void m2(){
        System.out.println("Hello world");
    }



}
