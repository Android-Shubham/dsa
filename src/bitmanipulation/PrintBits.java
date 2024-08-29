package bitmanipulation;

public class PrintBits {
    public static void main(String[] args) {
        printBits(35);
        printBits(5);
        printBits(10);
    }

    private static void printBits(int num) {
        int val = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 7; i >= 0; i--) {
            int res = num & val;
            if (res == 0) {
                sb.insert(0, 0);
            } else {
                sb.insert(0, 1);
            }
            val = val << 1;
        }

        System.out.println(sb);
    }
}
