package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ContigiousSubArray {
    public static void main(String[] args) {
        System.out.println(findSubArray(new int[]{3, 1, 2, 4}));
    }

    private static int findSubArray(int[] arr) {
        int sum = 0;

        for(int i=0;i<arr.length;i++){
            int min = arr[i];
            for(int j=i;j<arr.length;j++){
                if(min>arr[j]){
                    min = arr[j];
                    sum+=min;
                }
            }
        }

        return sum;
    }
}
