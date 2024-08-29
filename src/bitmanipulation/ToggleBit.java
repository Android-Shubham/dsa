package bitmanipulation;

public class ToggleBit {

    public static void main(String[] args) {
        printBits(5);
        toggleBits(5,1);

        printBits(10);
        toggleBits(10,2);
    }

    private static void toggleBits(int num, int bit) {
        System.out.println(Integer.toBinaryString(num ^ (1<<bit)));
    }

    private static void printBits(int num){
        int bit = 1;
        for(int i=7;i>=0;i--){
            int res = num & bit;
            bit = bit<<1;
            if(res==0){
                System.out.print(0);
            }else {
                System.out.print(1);
            }
        }
        System.out.println();
    }
}
