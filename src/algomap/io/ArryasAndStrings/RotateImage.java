package algomap.io.ArryasAndStrings;

//https://leetcode.com/problems/rotate-image/description/
public class RotateImage {
    public static void main(String[] args) {
        RotateImage rotateImage = new RotateImage();
        int[][] image = new int[3][3];
        image[0] = new int[]{1, 2, 3};
        image[1] = new int[]{4, 5, 6};
        image[2] = new int[]{7, 8, 9};
        rotateImage.rotate(image);

        for (int[] ints : image) {
            for (int j = 0; j < image[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    public void rotate(int[][] matrix) {
        int n = matrix.length;

        //transpose of a matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = temp;
            }
        }


    }
}
