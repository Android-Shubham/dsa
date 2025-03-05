package algomap.io.maths;

public class CountTotalNumberOfColoredCells {
    public long coloredCells(int n) {
        long blueCells = 1;
        int inc = 4;
        while(--n>0){
            blueCells+=inc;
            inc+=4;
        }
        return blueCells;
    }
}
