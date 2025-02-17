package leetcode;

public class CanPartition {
    public static void main(String[] args) {
        CanPartition canPartition = new CanPartition();
        System.out.println(canPartition.canPartition(81,9));
    }
    public boolean canPartition(int num, int target) {
        // Invalid partition found
        if (target < 0 || num < target) {
            return false;
        }

        // Valid partition found
        if (num == target) {
            return true;
        }

        // Recursively check all partitions for a valid partition
        return (
                canPartition(num / 10, target - (num % 10)) ||
                        canPartition(num / 100, target - (num % 100)) ||
                        canPartition(num / 1000, target - (num % 1000))
        );
    }
}
