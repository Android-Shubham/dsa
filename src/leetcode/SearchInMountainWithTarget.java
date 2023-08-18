package leetcode;

public class SearchInMountainWithTarget {

    public static void main(String[] args) {
        int[] mountainArr = {1,2,3,4,5,3,1};
        int target = 3;
        int peak = peakIndexInMountainArray(mountainArr);
        int ans = binarySearch(mountainArr,target,0,peak);
        if(ans != -1){
            System.out.println(ans);
        }else{
            ans = binarySearch(mountainArr,target,peak+1,mountainArr.length-1);
        }
        System.out.println(ans);
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


    private static int binarySearch(int[]  arr, int target,int start, int end) {
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = (start + (end-start)/2);
            if (arr[mid] == target) {
                return mid;
            } else if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}
