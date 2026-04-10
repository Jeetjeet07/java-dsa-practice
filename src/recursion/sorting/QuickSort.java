import java.util.*;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
//        sort(arr,0,arr.length-1);
//        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

    }

    static void sort(int[] nums, int low, int hi){
        if(low >= hi){
            return;
        }
        int s = low;
        int e = hi;
        int m = s +(e-s)/2;
        int pivot = nums[m];

        while(s<=e){
            //if already sorted ...not swap again
            while(nums[s]< pivot){
                s++;
            }
            while (nums[e] > pivot){
                e--;
            }

            if(s<=e){
                int temp = nums[s];
                nums[s]= nums[e];
                nums[e]= temp;
                s++;
                e--;
            }

// now pivot is it at correct index, sort two halves
            sort(nums,s,hi);
            sort(nums,low,e);

        }

    }

}
