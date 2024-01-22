package cyclicSort;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {0,3, 5, 2, 1, 4};
        //range is given
        //apply cyclic sort
        System.out.println(Arrays.toString(cyclicSort(arr)));
    }

    private static int[] cyclicSort(int[] arr) {
        int index = 0;
        int last =  arr.length;
        while (index<last){
            if(index!=arr[index]){
                swap(arr,index,arr[index]);
            }else {
                index++;
            }
        }
        return arr;
    }

    static void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

}
