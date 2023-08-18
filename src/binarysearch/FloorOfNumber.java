package binarysearch;

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 11, 14, 17, 20, 24, 30};
        int pos = ceilingOfANumber(arr, 7);
        System.out.println(pos);
        pos = ceilingOfANumber(arr, 30);
        System.out.println(pos);
        pos = ceilingOfANumber(arr, 4);
        System.out.println(pos);
        pos = ceilingOfANumber(arr, 15);
        System.out.println(pos);
        pos = ceilingOfANumber(arr, 0);
        System.out.println(pos);
    }

    private static int ceilingOfANumber(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        boolean isAscending = arr[start]<arr[end];

        while (start<=end){
            int mid = start +  (end - start) /2;
            if(target == arr[mid]){
                return mid;
            }

            if(isAscending) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return end;
    }
}
