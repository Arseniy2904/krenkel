package Urok_03;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {17, 22, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(getMin(matrix));
    }
    private static int getMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (min > matrix[i][j]) {
                    min = matrix[i][j];

                }

            }

        }
        return min;


    }
}
