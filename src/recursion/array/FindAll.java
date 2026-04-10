package recursion.array;

import java.util.*;

public class FindAll {
    public static void main(String[] args) {
        int[]  arr={4,5,6,6,7,8};
        int target =6;
//        findAllIndex(arr,target,0);
//        System.out.println(list);

//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer> ans = findAllIndex(arr,target,0,list);
//        System.out.println(ans);
//        System.out.println(list);

        System.out.println(findAllIndex2(arr,target,0));

    }

//    static ArrayList<Integer> list = new ArrayList<>();
//    static void findAllIndex(int[] arr, int target, int index){
//        if(index == arr.length){
//            return ;
//        }
//        if(arr[index] == target){
//            list.add(index);
//        }
//        findAllIndex(arr,target,index+1);
//    }


//    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index,ArrayList<Integer> list) {
//        // if here new list , will created with every ftn call
//        if (index == arr.length) {
//            return list;
//        }
//        if (arr[index] == target) {
//            list.add(index);
//        }
//        return findAllIndex(arr, target, index + 1,list);
//    }


    //NOT OPTIMIZED
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>(); //obj again nd again

        if (index == arr.length) {
            return list;
        }
        // this will contain ans from that ftn call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr,target,index+1);
        list.addAll(ansFromBelowCalls);

        return list;

    }

}













