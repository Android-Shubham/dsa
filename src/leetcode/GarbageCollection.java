package leetcode;

public class GarbageCollection {
    public int garbageCollection(String[] garbage, int[] travel) {
        int last_p = -1;
        int last_g = -1;
        int last_m = -1;
        int total = 0;
        for(int i=1;i<travel.length;i++){
            travel[i]+=travel[i-1];
        }
        for(int i=garbage.length-1;i>=0;i--){
            String g = garbage[i];
            total+=g.length();
            if(last_g==-1 && g.contains("G")){
                last_g = i;
            }
            if(last_p==-1 && g.contains("P")){
                last_p = i;
            }
            if(last_m==-1 && g.contains("M")){
                last_m = i;
            }
        }
        if(last_p>0){
            total+=(travel[last_p-1]);
        }
        if(last_g>0){
            total+=(travel[last_g-1]);
        }
        if(last_m>0){
            total+=(travel[last_m-1]);
        }
        return total;
    }
}
