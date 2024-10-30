package leetcode;

public class ValidMountainArray {

    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if(n<3) return false;
        int i = 0;
        while(i<n-1 && arr[i] < arr[i+1]){ //walk up the mountain
            i++;
        }
        if(i==0 || i==n-1) return false;
        while(i<n-1 && arr[i+1]<arr[i]){ // walk down the mountain
            i++;
        }
        return i==n-1;
    }

    public boolean validMountainArray_mySolution(int[] arr) {
        int index = 0;
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=max){
                max = arr[i];
                index = i;
            }
        }
        if(index==0 || index==arr.length-1){
            return false;
        }

        for(int i=index-1;i>=0;i--){
            if(arr[i]>=arr[i+1]){
                return false;
            }
        }
        for(int i=index+1;i<arr.length;i++){
            if(arr[i]>=arr[i-1]){
                return false;
            }
        }

        return true;
    }
}
