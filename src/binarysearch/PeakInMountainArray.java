package binarysearch;

//852. Peak Index in a Mountain Array
public class PeakInMountainArray {

    public static void main(String[] args) {
        int[] arr = {4,3,2,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            int mid = start + (end - start) / 2;
            if(mid<arr.length-1 && arr[mid + 1] > arr[mid]){
                start = mid + 1;
            }else if(mid>0 && arr[mid - 1] > arr[mid]){
                end = mid - 1;
            }else{
                return mid;
            }
        }

        return -1;
    }
}


