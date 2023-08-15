package linearsearch;

public class MaxValInArray {

    public static void main(String[] args) {
        int[] arr={1000,-200,12,13,90,45,66,77,33,22,88,81,-1,0,1,2,-100,200};
        int min = findMax(arr);
        System.out.println(min);
    }

    private static int findMax(int[] arr) {
        if(arr.length==0){
            return Integer.MAX_VALUE;
        }
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }
}

