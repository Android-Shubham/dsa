package leetcode;

import java.util.Arrays;
import java.util.List;

public class TimeDifference {

    public int findMinDifference(List<String> timePoints) {
        double[] times = new double[timePoints.size()];
        int index = 0;
        for(String str : timePoints){
            times[index++] = Double.parseDouble(str.replace(':','.'));
        }
        Arrays.sort(times);
        System.out.println(Arrays.toString(times));
        return 0;
    }
}
