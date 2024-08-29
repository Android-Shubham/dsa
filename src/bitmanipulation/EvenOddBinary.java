package bitmanipulation;

public class EvenOddBinary {
    public static void main(String[] args) {
        evenOdd(5);
        evenOdd(10);
        evenOdd(32);
    }

    private static void evenOdd(int num){
        if((num & 1) ==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}
