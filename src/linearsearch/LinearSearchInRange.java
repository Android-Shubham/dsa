package linearsearch;

public class LinearSearchInRange {
    public static void main(String[] args) {
        int[] arr={12,13,90,45,66,77,33,22,88,81};
        int start = 3;
        int end = 4;
        int target = 66;
        int pos = linearSearch(arr,target,start,end);
        System.out.println(pos);
    }

    private static int linearSearch(int[] arr, int target, int start, int end) {
        if(arr.length==0){
            return -1;
        }
        if(end>arr.length){
            return -1;
        }

        for (int index = start; index <= end; index++) {
            int num = arr[index];
            if(num==target){
                return index;
            }
        }

        return -1;
    }
}
