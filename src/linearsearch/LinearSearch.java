package linearsearch;

public class LinearSearch {
    public static void main(String[] args) {

        int[] arr={12,13,90,45,66,77,33,22,88,81};
        int pos = linearSearch(arr,1);
        System.out.println(pos);
    }

    private static int linearSearch(int[] arr,int target) {

        if(arr.length==0){
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    }


}
