import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
//        dice("", 4);
//        System.out.println(diceRet(" ",4));
        diceFace("",4,7);
    }

    static void  dice(String p, int target){
        if(target ==0){
            System.out.println(p);
            return;
        }
        for(int i=1; i<=6 && i<=target; i++){
            dice(p+i,target-i);
        }
    }


    static ArrayList<String> diceRet(String p, int target){
        if(target ==0){
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<String>();
        for(int i=1; i<=6 && i<=target; i++){
            list.addAll(diceRet(p+i,target-i));
        }
        return list;
    }


    static void  diceFace(String p, int target,int face){
        if(target ==0){
            System.out.println(p);
            return;
        }
        for(int i=1; i<=face && i<=target; i++){
            diceFace(p+i,target-i,face);
        }
    }
}
