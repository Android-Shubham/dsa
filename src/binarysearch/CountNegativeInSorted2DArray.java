package binarysearch;

public class CountNegativeInSorted2DArray {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int[] ints : grid) {
            if (ints[0] < 0) {
                count += ints.length;
                continue;
            }
            count += binarySearch(ints);
        }
        return count;
    }

    private int binarySearch(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(arr[mid]>=0){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return arr.length - start;
    }
}
