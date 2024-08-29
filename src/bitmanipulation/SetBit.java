package bitmanipulation;

public class SetBit {
    public static void main(String[] args) {
        setBit(5,1);
        setBit(8,2);
    }

    private static void setBit(int num,int bit){
        System.out.println(Integer.toBinaryString(num));
        System.out.println(Integer.toBinaryString(num | 1<<bit));
    }
}
