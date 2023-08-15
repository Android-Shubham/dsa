package linearsearch;

public class MinInArray {
    public static void main(String[] args) {
        int[] arr={-200,12,13,90,45,66,77,33,22,88,81,-1,0,1,2,-100};
        int min = findMin(arr);
        System.out.println(min);
    }

    private static int findMin(int[] arr) {
        if(arr.length==0){
            return Integer.MIN_VALUE;
        }
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }

        return min;
    }
}
