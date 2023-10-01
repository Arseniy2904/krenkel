package Urok_03;

import java.util.Arrays;

public class String05 {

    public class Main {
        public static void main(String[] args) {
            int[][] matrix = {
                    {1, 3, 5, 11},
                    {2, 4, 8, 45},
                    {6, 9, 8, 87}
            };

            System.out.println(Arrays.deepToString(sortMatrix(matrix)));
            printMatrix(sortMatrix(matrix));
        }

        private static void printMatrix(int[][] matrix) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }

        private static int[][] sortMatrix(int[][] matrix) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    for (int k = 0; k < matrix.length; k++) {
                        for (int l = 0; l < matrix[k].length; l++) {
                            if (matrix[i][j] < matrix[k][l]) {
                                int temp = matrix[i][j];
                                matrix[i][j] = matrix[k][l];
                                matrix[k][l] = temp;
                            }
                        }
                    }
                }
            }
            return matrix;
        }
    }
}

