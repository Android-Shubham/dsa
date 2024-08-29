package bitmanipulation;

public class IsBitSet {

    public static void main(String[] args) {
        System.out.println(isBitSet(5,1));
        System.out.println(isBitSet(10,3));
        System.out.println(isBitSet(12,4));
        System.out.println(isBitSet(32,6));

    }
    private static boolean isBitSet(int num,int bit){
        return (num & (1<<bit)) !=0;
    }
}
