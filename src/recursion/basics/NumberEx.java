package recursion.basics;

public class NumberEx {
    public static void main(String[] args) {
        // function that take in no. and prints it
        //print first 5 no. - like hello worl

        //RECURSION
        print(1);
    }

    static void print(int n){
        // Base condition -break point
        if(n==5){
            System.out.println(5);
            return;
        }
        //print
        System.out.println(n);
        //recursive call
        // calling a ftn again &again , treat as separate call in stack
        print(n+1);  // last statement in call
        //TAIL recursion
    }
}
