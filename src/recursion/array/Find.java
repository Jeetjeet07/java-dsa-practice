package recursion.array;

public class Find {
    public static void main(String[] args) {
        int target = 18;
        int[] arr ={2,4,5,6,18,18,9};
        System.out.println(find(arr,18,0));
        System.out.println(findIndex(arr,18,0));
        System.out.println(findIndexLast(arr,18,arr.length-1));
    }

    static boolean find(int[]arr,int target, int index){
        if (index == arr.length) {  //out of bound
            return false;
        }
        return arr[index]== target || find(arr,target,index+1);
    }

    static int findIndex(int[]arr,int target, int index){
        if (index == arr.length) {  //out of bound
            return -1;
        }
        if(arr[index]== target){
            return index;
        } else{
            return findIndex(arr,target,index+1);
        }
    }

    static int findIndexLast(int[]arr,int target, int index){
        if (index == -1) {  //out of bound
            return -1;
        }
        if(arr[index]== target){
            return index;
        } else{
            return findIndexLast(arr,target,index-1);
        }
    }


}
