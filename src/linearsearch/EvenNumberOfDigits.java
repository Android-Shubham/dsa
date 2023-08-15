package linearsearch;

public class EvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums = {121, 345, 2, 6, 78961, 342};
        System.out.println(evenDigits(nums));
    }

    private static int evenDigits(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int total = 0;
        for (int index = 0; index < nums.length; index++) {
            if (isEvenDigit(nums[index])) {
                total++;
            }
        }
        return total;
    }

    private static boolean isEvenDigit(int num) {
        if (num == 0) {
            return false;
        }

        if (num < 0) {
            num *= -1;
        }

        int digits = 0;
        while (num > 0) {
            num /= 10;
            digits++;
        }
        return digits % 2 == 0;
    }
}
