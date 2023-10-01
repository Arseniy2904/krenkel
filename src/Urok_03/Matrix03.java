package Urok_03;

import java.util.Arrays;

public class Matrix03 {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}

        };
        for (int i = 2; i <= 2; i++) {
            for (int j = 2; j <= 2; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][j]++;
                    for (int k = 3; k <= 3; k++) {
                        for (int l = 1; l <= 3; l++) {
                            if (matrix[k][l] == 0) {
                                matrix[k][l]++;
                                for (int m = 4; m <= 4; m++) {
                                    for (int n = 0; n <= 4; n++) {
                                        if (matrix[m][n] == 0) {
                                            matrix[m][n]++;
                                        }
                                    }
                                }
                            }
                        }
                        System.out.println(matrix[i][j] + "   ");
                    }
                    System.out.println(Arrays.deepToString(matrix)); // НЕ ПОНИМАЮ, КАК СДЕЛАТЬ В СТОЛБИК!(
                }
            }
        }
    }
}

