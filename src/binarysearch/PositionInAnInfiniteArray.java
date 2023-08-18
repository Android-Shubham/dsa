package binarysearch;

public class PositionInAnInfiniteArray {

    //position of an element in a sorted array of infinite numbers

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,10,11,12,13,14,15,16,17,18,19,20};
        int pos = positionInInfiniteArray(arr, 4);
        System.out.println(pos);
    }

    private static int positionInInfiniteArray(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (arr[end]<target){
            start = end+1;
            end = end + (end * 2);
        }
        return binarySearch(arr,target,start,end);
    }

    private static int binarySearch(int[] arr, int target,int start, int end) {

        if (arr.length == 0) {
            return -1;
        }

        while (start <= end) {
            int mid = (start + (end-start)/2);
            if (arr[mid] == target) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
