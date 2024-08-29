package bitmanipulation;

public class PowerOfTwo {

    public static void main(String[] args) {
        powerOfTwo(32);
        powerOfTwo(33);
    }
    private static void powerOfTwo(int num){
        System.out.println((num & num - 1) == 0);
    }
}
