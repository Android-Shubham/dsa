package leetcode;

public class NeighbouringBitwiseXor {
    public boolean doesValidArrayExist(int[] derived) {
        int xor = 0;
        for(int num : derived){
            xor^=num;
        }
        return xor==0;
    }
}
