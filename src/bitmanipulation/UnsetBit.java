package bitmanipulation;

public class UnsetBit {
    public static void main(String[] args) {
        unsetBit(5,0);
        unsetBit(10,3);
    }
    private static void unsetBit(int num,int bit){
        System.out.println(Integer.toBinaryString(num & ~(1<<bit)));
    }
}
