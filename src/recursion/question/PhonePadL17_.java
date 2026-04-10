import java.util.*;

public class PhonePadL17_ {
    public static void main(String[] args) {
//        pad(" ","23");

        System.out.println(padRet(" ","12").size());
        System.out.println(padCount(" ","12"));

    }

    static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0)- '0';

        for(int i = 3*(digit-1); i<3*digit; i++){
            char ch = (char) ('a' + i);
            pad(p+ch,up.substring(1));
        }
    }

    static ArrayList<String> padRet(String p, String up){
        if(up.isEmpty()){
//            System.out.println(p);
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0)- '0'; // this will convert '2' into 2
        ArrayList<String> list = new ArrayList<String>();

        for(int i = 3*(digit-1); i<3*digit; i++){
            char ch = (char) ('a' + i);
            list.addAll(padRet(p+ch,up.substring(1)));
        }
        return list;
    }



    static int padCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }

        int count =0;
        int digit = up.charAt(0)- '0';

        for(int i = 3*(digit-1); i<3*digit; i++){
            char ch = (char) ('a' + i);
            count = count + padCount(p+ch,up.substring(1));
        }
        return count;
    }


}
