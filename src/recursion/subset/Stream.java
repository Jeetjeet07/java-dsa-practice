//SKIP a CHARACTER
public class Stream {
    public static void main(String[] args) {
//        skip(" ","baccd");
//
//        System.out.println(skip("baccdah"));
        System.out.println(skipApple("bacapplecdah"));
        System.out.println(skipApp("bacapplcdah"));


    }

    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        if(ch== 'a'){
            skip(p,up.substring(1));
        } else{
            skip(p+ch,up.substring(1));
        }
    }

    // return STRING
    static String skip( String up){
        if(up.isEmpty()){
            return " ";
        }
        char ch = up.charAt(0);

        if(ch== 'a'){
            return skip(up.substring(1));
        } else{
            return ch + skip(up.substring(1));
        }
    }


    //STRING
    static String skipApple( String up){
        if(up.isEmpty()){
            return " ";
        }

        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        } else{
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

    static String skipApp( String up){
        if(up.isEmpty()){
            return " ";
        }

        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipApp(up.substring(3));
        } else{
            return up.charAt(0) + skipApp(up.substring(1));
        }
    }

}


